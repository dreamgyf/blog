# 博客-后端
### 项目简介
本项目为使用SpringBoot+Mybatis搭建的博客的后端部分
### 项目说明
博客的前端部分使用Github Pages托管在Github上，后端与前端分离开来管理
### 项目链接
> [始终都是梦的博客](https://dreamgyf.github.io)  
> [博客的前端仓库](https://github.com/dreamgyf/dreamgyf.github.io)
### 项目结构
```

├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── dreamgyf
│   │   │           └── blog
│   │   │               ├── BlogApplication.java    //主启动类
│   │   │               ├── config
│   │   │               │   └── CorsConfig.java    //设置跨域
│   │   │               ├── controller
│   │   │               │   ├── AdminController.java
│   │   │               │   └── ArticleController.java
│   │   │               ├── dao
│   │   │               │   └── mapper
│   │   │               │       ├── AdminMapper.java
│   │   │               │       └── ArticleMapper.java
│   │   │               ├── entity
│   │   │               │   ├── Admin.java
│   │   │               │   └── Article.java
│   │   │               ├── exception
│   │   │               │   ├── AlreadyLogInException.java
│   │   │               │   └── UsernameOrPasswordErrorException.java
│   │   │               ├── httpSessionListener
│   │   │               │   └── VisitorCount.java    //记录访客人数
│   │   │               └── service
│   │   │                   ├── AdminService.java
│   │   │                   ├── ArticleService.java
│   │   │                   └── impl
│   │   │                       ├── AdminServiceImpl.java
│   │   │                       └── ArticleServiceImpl.java
│   │   └── resources
│   │       ├── 2045628_www.newbee.cf.pfx    //SSL证书文件
│   │       ├── application.properties    //配置文件
│   │       ├── mapper
│   │       │   ├── adminMapper.xml
│   │       │   └── articleMapper.xml
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── dreamgyf
│                   └── blog
│                       └── BlogApplicationTests.java
├── HELP.md
├── blog.iml
├── mvnw
├── mvnw.cmd
└── pom.xml    //maven项目管理

```
### 项目使用
> SpringBoot  
> Maven   
> Mybatis  
> MySql