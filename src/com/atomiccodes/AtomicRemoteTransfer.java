/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.atomiccodes;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author rodolfo.abreu
 */
public class AtomicRemoteTransfer {

    private static String REMOTE_HOST = "10.240.0.24";
    private static String USERNAME = ".\\laboratorio";
    private static String PASSWORD = "lab@@2020";
    private static String EXTENSION = ".txt";
    private static String PATH_TARGET = "";
    private static String PATH_DIR = "";
    private static int REMOTE_PORT = 22;
    private static int SESSION_TIMEOUT = 10000;
    private static int CHANNEL_TIMEOUT = 5000;

    public static void NioTransfer() throws IOException {
        File folder = new File(PATH_TARGET);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
            if (listOfFiles[i].getName().endsWith(EXTENSION)) {
                Path temp = Files.move
                (Paths.get(listOfFiles[i].getName()),
                Paths.get(PATH_DIR + listOfFiles[i].getName()));
                if(temp != null) {
                    System.out.println("File renamed and moved successfully");
                } else {
                    System.out.println("Failed to move the file");
                }
            }
          }
        }
    }
    
    public void RemoteTransfer() {
        
        // local
        String localFile = PATH_TARGET;

        // remote server
        String remoteFile = PATH_DIR;

        Session jschSession = null;
        
        try {

            JSch jsch = new JSch();
            jsch.setKnownHosts("10.240.0.24");
            jschSession = jsch.getSession(USERNAME, REMOTE_HOST, REMOTE_PORT);

            // authenticate using private key
            // jsch.addIdentity("/home/mkyong/.ssh/id_rsa");

            // authenticate using password
            jschSession.setPassword(PASSWORD);

            // 10 seconds session timeout
            jschSession.connect(SESSION_TIMEOUT);

            Channel sftp = jschSession.openChannel("sftp");

            // 5 seconds timeout
            sftp.connect(CHANNEL_TIMEOUT);

            ChannelSftp channelSftp = (ChannelSftp) sftp;

            // transfer file from local to remote server
            channelSftp.put(localFile, remoteFile);

            // download file from remote server to local
            // channelSftp.get(remoteFile, localFile);

            channelSftp.exit();

        } catch (JSchException | SftpException e) {

            e.printStackTrace();

        } finally {
            if (jschSession != null) {
                jschSession.disconnect();
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String fileName = "app.config";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
            EXTENSION = prop.getProperty("app.extension");
            PATH_TARGET = prop.getProperty("app.target");
            PATH_DIR = prop.getProperty("app.to");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        NioTransfer();
    }
    
}
