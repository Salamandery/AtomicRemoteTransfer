<div align="center">

# 🔄 AtomicRemoteTransfer

[![Java](https://img.shields.io/badge/Java-18-orange.svg?style=for-the-badge&logo=java)](https://openjdk.java.net/)
[![NetBeans](https://img.shields.io/badge/NetBeans-IDE-blue.svg?style=for-the-badge&logo=apache-netbeans-ide)](https://netbeans.apache.org/)
[![JSch](https://img.shields.io/badge/JSch-0.1.55-green.svg?style=for-the-badge&logo=java)](http://www.jcraft.com/jsch/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge&logo=mit)](LICENSE)
[![Build](https://img.shields.io/badge/Build-Ant-orange.svg?style=for-the-badge&logo=apache-ant)](https://ant.apache.org/)

> **Sistema de transferência remota de arquivos via SFTP com processamento automático de extensões configuráveis.**

[![GitHub stars](https://img.shields.io/github/stars/salamandery/AtomicRemoteTransfer?style=social)](https://github.com/salamandery/AtomicRemoteTransfer)
[![GitHub forks](https://img.shields.io/github/forks/salamandery/AtomicRemoteTransfer?style=social)](https://github.com/salamandery/AtomicRemoteTransfer)
[![GitHub issues](https://img.shields.io/github/issues/salamandery/AtomicRemoteTransfer)](https://github.com/salamandery/AtomicRemoteTransfer/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/salamandery/AtomicRemoteTransfer)](https://github.com/salamandery/AtomicRemoteTransfer/pulls)

---

</div>

## 📋 Sumário

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Arquitetura](#arquitetura)
- [Configuração](#configuração)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)

## 🎯 Visão Geral

<div align="center">

![Java](https://img.shields.io/badge/Java-18-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![SFTP](https://img.shields.io/badge/SFTP-Transfer-00C851?style=for-the-badge&logo=ssh&logoColor=white)
![Security](https://img.shields.io/badge/Security-SSH-FF6B6B?style=for-the-badge&logo=shield&logoColor=white)

</div>

O **AtomicRemoteTransfer** é uma aplicação Java desenvolvida para automatizar a transferência de arquivos entre sistemas locais e remotos utilizando o protocolo SFTP. O sistema oferece processamento automático de arquivos baseado em extensões configuráveis e transferência segura via SSH.

<div align="center">

![Transfer Process](https://img.shields.io/badge/Process-Local%20→%20Remote-9C27B0?style=for-the-badge&logo=arrow-right&logoColor=white)

</div>

## ✨ Funcionalidades

<div align="center">

| 🔐 **Segurança** | 📁 **Automação** | ⚙️ **Configuração** |
|:---:|:---:|:---:|
| Transferência SFTP criptografada | Processamento automático de arquivos | Configuração externa flexível |
| Conexão SSH segura | Filtro por extensões | Parâmetros via arquivo |
| Autenticação robusta | Movimentação NIO eficiente | Hosts e usuários configuráveis |

</div>

<div align="center">

![Features](https://img.shields.io/badge/Features-6%20Core%20Functions-4CAF50?style=for-the-badge&logo=check-circle&logoColor=white)

</div>

## 🛠️ Tecnologias Utilizadas

<div align="center">

### 🎯 Core Technologies

![Java](https://img.shields.io/badge/Java-18-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JSch](https://img.shields.io/badge/JSch-0.1.55-4CAF50?style=for-the-badge&logo=java&logoColor=white)
![NIO](https://img.shields.io/badge/Java%20NIO-API-FF9800?style=for-the-badge&logo=java&logoColor=white)

### 🔧 Build & Development

![Apache Ant](https://img.shields.io/badge/Apache%20Ant-1.10.14-A81C7D?style=for-the-badge&logo=apache-ant&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Dependencies-FF6B6B?style=for-the-badge&logo=apache-maven&logoColor=white)

### 🏗️ Padrões de Projeto

![Singleton](https://img.shields.io/badge/Singleton-Pattern-9C27B0?style=for-the-badge&logo=java&logoColor=white)
![Factory](https://img.shields.io/badge/Factory-Pattern-607D8B?style=for-the-badge&logo=java&logoColor=white)
![Strategy](https://img.shields.io/badge/Strategy-Pattern-795548?style=for-the-badge&logo=java&logoColor=white)
![Configuration](https://img.shields.io/badge/Configuration-Pattern-FF5722?style=for-the-badge&logo=java&logoColor=white)

</div>

## 🏗️ Arquitetura

<div align="center">

![Architecture](https://img.shields.io/badge/Architecture-MVC%20Pattern-3F51B5?style=for-the-badge&logo=diagram&logoColor=white)

</div>

```
┌─────────────────────────────────────────────────────────────┐
│                    AtomicRemoteTransfer                    │
├─────────────────────────────────────────────────────────────┤
│  📁 src/                                                   │
│  └── com/atomiccodes/                                     │
│      └── AtomicRemoteTransfer.java    # 🎯 Classe principal │
├─────────────────────────────────────────────────────────────┤
│  📦 lib/                                                   │
│  └── jsch-0.1.55.jar                 # 🔐 Biblioteca SFTP  │
├─────────────────────────────────────────────────────────────┤
│  ⚙️ nbproject/                      # 🔧 Configurações IDE │
│  📄 build.xml                        # 🏗️ Script de build   │
│  ⚙️ app.config                       # 📋 Configurações     │
└─────────────────────────────────────────────────────────────┘
```

### Componentes Principais

1. **AtomicRemoteTransfer.java**: Classe principal contendo:
   - `NioTransfer()`: Processamento local de arquivos
   - `RemoteTransfer()`: Transferência SFTP
   - `main()`: Ponto de entrada da aplicação

2. **Configuração Externa**:
   - `app.config`: Arquivo de propriedades
   - Parâmetros de conexão e diretórios

## ⚙️ Configuração

<div align="center">

![Configuration](https://img.shields.io/badge/Configuration-External%20File-FF9800?style=for-the-badge&logo=settings&logoColor=white)

</div>

### 📄 Arquivo app.config

<div align="center">

```properties
┌─────────────────────────────────────────────────────────────┐
│                    app.config                              │
├─────────────────────────────────────────────────────────────┤
│ app.extension=.ENV                                        │
│ app.target=C:\MATRIX\ENV\                                │
│ app.to=\\10.240.0.24\COMPART_PRD\LAB\ENV\               │
└─────────────────────────────────────────────────────────────┘
```

</div>

### 🔐 Parâmetros de Conexão SFTP

<div align="center">

```java
┌─────────────────────────────────────────────────────────────┐
│                SFTP Connection Settings                    │
├─────────────────────────────────────────────────────────────┤
│ REMOTE_HOST = "10.240.0.24"                              │
│ USERNAME = ".\\laboratorio"                               │
│ PASSWORD = "lab@@2020"                                    │
│ REMOTE_PORT = 22                                          │
│ SESSION_TIMEOUT = 10000                                   │
│ CHANNEL_TIMEOUT = 5000                                    │
└─────────────────────────────────────────────────────────────┘
```

</div>

## 🚀 Instalação

<div align="center">

![Installation](https://img.shields.io/badge/Installation-Guide-4CAF50?style=for-the-badge&logo=download&logoColor=white)

</div>

### 📋 Pré-requisitos

<div align="center">

![Java](https://img.shields.io/badge/Java-18+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![Apache Ant](https://img.shields.io/badge/Apache%20Ant-1.10.14+-A81C7D?style=for-the-badge&logo=apache-ant&logoColor=white)

</div>

### 🔧 Passos de Instalação

<div align="center">

| Step | Command | Description |
|:---:|:---|:---|
| 1️⃣ | `git clone [URL]` | Clone o repositório |
| 2️⃣ | `cd AtomicRemoteTransfer` | Entre no diretório |
| 3️⃣ | `java -version` | Verifique Java |
| 4️⃣ | `nano app.config` | Configure parâmetros |
| 5️⃣ | `ant build` | Compile o projeto |

</div>

```bash
# 🚀 Quick Start
git clone [URL_DO_REPOSITORIO]
cd AtomicRemoteTransfer
java -version
nano app.config  # Configure suas settings
ant build
```

## 📖 Uso

<div align="center">

![Usage](https://img.shields.io/badge/Usage-Guide-2196F3?style=for-the-badge&logo=play&logoColor=white)

</div>

### 🚀 Execução Básica

<div align="center">

```bash
┌─────────────────────────────────────────────────────────────┐
│                    Execution Commands                      │
├─────────────────────────────────────────────────────────────┤
│ ant run                    # 🏗️ Compilar e executar       │
│ java -jar dist/AtomicRemoteTransfer.jar                   │
│                           # 📦 Executar JAR diretamente   │
└─────────────────────────────────────────────────────────────┘
```

</div>

### 🔄 Fluxo de Execução

<div align="center">

| Step | Process | Description |
|:---:|:---|:---|
| 1️⃣ | 📋 **Configuração** | Leitura do `app.config` |
| 2️⃣ | 📁 **Processamento** | Filtro de arquivos por extensão |
| 3️⃣ | 🔐 **Transferência** | Conexão SFTP e upload |
| 4️⃣ | 📊 **Logging** | Monitoramento das operações |

</div>

### 💡 Exemplo de Uso

<div align="center">

```java
┌─────────────────────────────────────────────────────────────┐
│                    Process Flow                            │
├─────────────────────────────────────────────────────────────┤
│ 1. 📁 Lê arquivos .ENV de C:\MATRIX\ENV\                │
│ 2. 🔐 Conecta SFTP ao servidor 10.240.0.24              │
│ 3. 📤 Transfere para \\10.240.0.24\COMPART_PRD\LAB\ENV\ │
└─────────────────────────────────────────────────────────────┘
```

</div>

## 📁 Estrutura do Projeto

<div align="center">

![Project Structure](https://img.shields.io/badge/Project-Structure-673AB7?style=for-the-badge&logo=folder&logoColor=white)

</div>

```
┌─────────────────────────────────────────────────────────────┐
│                AtomicRemoteTransfer                        │
├─────────────────────────────────────────────────────────────┤
│  📁 src/                                                   │
│  └── com/atomiccodes/                                     │
│      └── AtomicRemoteTransfer.java    # 🎯 Main Class     │
│                                      # 📊 126 lines       │
├─────────────────────────────────────────────────────────────┤
│  📦 lib/                                                   │
│  └── jsch-0.1.55.jar                 # 🔐 SFTP Library   │
│                                      # 📦 274KB           │
├─────────────────────────────────────────────────────────────┤
│  ⚙️ nbproject/                      # 🔧 IDE Config       │
│  ├── project.xml                      # 📄 Project XML     │
│  ├── project.properties               # ⚙️ Build Props     │
│  └── build-impl.xml                   # 🏗️ Build Impl     │
├─────────────────────────────────────────────────────────────┤
│  📄 build.xml                        # 🏗️ Ant Script      │
│  ⚙️ app.config                       # 📋 Config File     │
│  📁 build/                           # 🔨 Compiled Files  │
│  📦 dist/                            # 📦 Distribution    │
└─────────────────────────────────────────────────────────────┘
```

### 📊 Detalhes Técnicos

<div align="center">

| Metric | Value | Badge |
|:---:|:---|:---|
| **Tamanho** | ~300KB | ![Size](https://img.shields.io/badge/Size-300KB-blue?style=for-the-badge) |
| **Linhas de Código** | ~200 | ![Lines](https://img.shields.io/badge/Lines-200-green?style=for-the-badge) |
| **Dependências** | 1 externa | ![Dependencies](https://img.shields.io/badge/Dependencies-1-orange?style=for-the-badge) |
| **Compatibilidade** | Java 18+ | ![Java](https://img.shields.io/badge/Java-18+-ED8B00?style=for-the-badge&logo=java&logoColor=white) |

</div>

## 🤝 Contribuição

<div align="center">

![Contributing](https://img.shields.io/badge/Contributing-Welcome-4CAF50?style=for-the-badge&logo=github&logoColor=white)

</div>

### 🚀 Como Contribuir

<div align="center">

| Step | Action | Command |
|:---:|:---|:---|
| 1️⃣ | **Fork** | Click "Fork" no GitHub |
| 2️⃣ | **Clone** | `git clone [your-fork-url]` |
| 3️⃣ | **Branch** | `git checkout -b feature/AmazingFeature` |
| 4️⃣ | **Commit** | `git commit -m 'Add AmazingFeature'` |
| 5️⃣ | **Push** | `git push origin feature/AmazingFeature` |
| 6️⃣ | **PR** | Create Pull Request |

</div>

### 📋 Padrões de Código

<div align="center">

![Java](https://img.shields.io/badge/Java-Conventions-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Documentation](https://img.shields.io/badge/Documentation-Required-2196F3?style=for-the-badge&logo=book&logoColor=white)
![Testing](https://img.shields.io/badge/Testing-Required-4CAF50?style=for-the-badge&logo=test&logoColor=white)
![Compatibility](https://img.shields.io/badge/Java%2018+-Required-FF9800?style=for-the-badge&logo=java&logoColor=white)

</div>

### 🐛 Relatório de Bugs

<div align="center">

```bash
┌─────────────────────────────────────────────────────────────┐
│                    Bug Report Template                     │
├─────────────────────────────────────────────────────────────┤
│ 🐛 **Bug Description**: [Describe the issue]              │
│ 🔍 **Steps to Reproduce**: [1, 2, 3...]                  │
│ 📊 **Expected vs Actual**: [What should vs what happens]  │
│ 💻 **Environment**: [OS, Java version, etc.]              │
│ 📝 **Logs**: [Include error logs if available]            │
└─────────────────────────────────────────────────────────────┘
```

</div>

---

## 📄 Licença

<div align="center">

![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge&logo=mit&logoColor=white)

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

</div>

--- 
## 👨‍💻 Autor

<div align="center">

![Developer](https://img.shields.io/badge/Developer-Rodolfo%20M.%20F.%20Abreu-blue?style=for-the-badge&logo=github)
![Java](https://img.shields.io/badge/Java-Developer-orange?style=for-the-badge&logo=java)
![SFTP](https://img.shields.io/badge/SFTP-Expert-green?style=for-the-badge&logo=ssh)
![Backend](https://img.shields.io/badge/Backend-Developer-blue?style=for-the-badge&logo=server)

**by [Rodolfo M. F. Abreu](https://github.com/salamandery)**

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

</div>

---

<div align="center">

**🔄 Desenvolvido com ❤️ usando Java e JSch 🔄**

[![Made with Love](https://img.shields.io/badge/Made%20with-Love-red.svg?style=for-the-badge&logo=heart)]()
[![Java](https://img.shields.io/badge/Powered%20by-Java-orange.svg?style=for-the-badge&logo=java)]()
[![JSch](https://img.shields.io/badge/SFTP-JSch-green.svg?style=for-the-badge&logo=ssh)]()

</div>