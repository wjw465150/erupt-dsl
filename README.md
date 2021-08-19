# Erupt Querydsl Extension module.

[Erupt Project](https://github.com/erupts/erupt) Querydsl Extension module(Erupt框架的一个Querydsl扩展模块).

## Erupt简介

Erupt 是一个低代码 全栈类 框架，它使用 Java 注解 动态生成页面以及增、删、改、查、权限控制等后台功能。
零前端代码、零 CURD、自动建表，仅需 一个类文件 + 简洁的注解配置，快速开发企业级 Admin 管理后台。
提供企业级中后台管理系统的全栈解决方案，大幅压缩研发周期，专注核心业务。

> **💡提示:** 完美取代 代码生成器，开发后台管理系统更优解！



## Querydsl简介

Querydsl是一个框架，可用于构造静态类型的类似SQL的查询。可以通过诸如Querydsl之类的流畅API构造查询，而不是将查询编写为内联字符串或将其外部化为XML文件。

例如，与简单字符串相比，使用流利的API的好处是

- 在IDE中使用代码完成；会有代码提示和自动补全，较为高效
- (几乎)语法安全；
- 可以安全地引用域类型和属性；可以直接使用领域模型进行操作，毕竟本质就是面向对象
- 更好地重构域类型的更改
- 跟写SQL一样的方便



## Maven配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.3.12.RELEASE</version>
    <relativePath/>
    <!-- lookup parent from repository -->
  </parent>

  <properties>
    <erupt.version>1.7.3</erupt.version>
    <java.version>1.8</java.version>
    <queryDslVersion>4.4.0</queryDslVersion>
  </properties>

  <dependencies>
      ...

    <!-- Erupt 框架 -->
    <!--  定时任务-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-job</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--用户权限管理-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-upms</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--接口数据安全-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-security</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--后台WEB界面-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-web</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--代码生成-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-generator</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--服务监控模块 -->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-monitor</artifactId>
      <version>${erupt.version}</version>
    </dependency>
    <!--模板UI库-->
    <dependency>
      <groupId>xyz.erupt</groupId>
      <artifactId>erupt-tpl</artifactId>
      <version>${erupt.version}</version>
    </dependency>

    <!-- 引入QueryDSL依赖  -->
    <dependency>
      <groupId>com.querydsl</groupId>
      <artifactId>querydsl-jpa</artifactId>
      <version>${queryDslVersion}</version>
    </dependency>
    <dependency>
      <groupId>com.querydsl</groupId>
      <artifactId>querydsl-apt</artifactId>
      <version>${queryDslVersion}</version>
      <scope>provided</scope>
    </dependency>
    <!-- erupt-dsl -->
    <dependency>
      <groupId>com.github.wjw465150</groupId>
      <artifactId>querydsl-dsl</artifactId>
      <version>${erupt.version}</version>
    </dependency>
  </dependencies>

  <!-- 添加这个插件是为了让程序自动生成query type(查询实体，命名方式为："Q"+对应实体名)。 -->
  <build>
    <plugins>
        ...
        <plugin>
            <groupId>com.mysema.maven</groupId>
            <artifactId>apt-maven-plugin</artifactId>
            <version>1.1.3</version>
            <executions>
                <execution>
                    <goals>
                        <goal>process</goal>
                    </goals>
                    <configuration>
                        <outputDirectory>target/generated-sources/java</outputDirectory>  <!-- 设定生成的Q类存放的位置  -->
                        <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor> 
                        <options>
                          <querydsl.excludedPackages>xyz.erupt.upms,xyz.erupt.bi</querydsl.excludedPackages>  <!-- 设定QueryDsl要排除的包(逗号来分割) -->
                        </options>
                    </configuration>
                </execution>
            </executions>
        </plugin>
      </plugins>
  </build>
</project>

```

> 注：在使用过程中,如果遇到Q类无法自动生成的情况，用maven更新一下项目即可解决(右键项目->Maven->Update Project)， 或者之间终端输入 mvn clean compile 编译一下就会自动生成Q 类



## Gradle配置

```groovy
buildscript {
  repositories {
    mavenLocal()
    maven { url "https://maven.aliyun.com/nexus/content/groups/public/" }  //优先使用阿里的镜像
    mavenCentral()
  }

  dependencies {
    //classpath 'org.apache.commons:commons-csv:1.0'
  }
}

plugins {
  id 'org.springframework.boot' version '2.3.12.RELEASE'
  id 'io.spring.dependency-management' version '1.0.11.RELEASE'
  id 'java'
}

ext {
  erupt = [version : '1.7.3']
  queryDslVersion = '4.4.0'
  querydslGeneratedSourcesDir = file("$buildDir/generated-sources/java")
}

//把QueryDSL生成的Q开头的类文件加入到源代码目录中
sourceSets {
  main {
    java {
      srcDirs += [querydslGeneratedSourcesDir]
    }
  }
}

compileJava {
  doFirst {
    //先创建Q类存放的位置目录
    querydslGeneratedSourcesDir.mkdirs()
  }

  options.encoding = 'UTF-8'
  options.deprecation = true
  options.compilerArgs += ["-parameters","-Xlint:deprecation"]
  
  options.compilerArgs += ['-s', querydslGeneratedSourcesDir]  //设定生成的Q类存放的位置
  options.compilerArgs += ["-Aquerydsl.excludedPackages=xyz.erupt.upms,xyz.erupt.bi"]  //设定QueryDsl要排除的包列表(逗号来分割)
  
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '1.8'

repositories {
  mavenLocal()
  maven { url "https://maven.aliyun.com/nexus/content/groups/public/" }  //优先使用阿里的镜像
  mavenCentral()
}

dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-web'
  implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
  
  ...
    
  //Erupt框架
  implementation group: 'xyz.erupt', name: 'erupt-upms', version: "${erupt.version}"  //用户权限管理
  implementation group: 'xyz.erupt', name: 'erupt-security', version: "${erupt.version}"  //接口数据安全
  implementation group: 'xyz.erupt', name: 'erupt-web', version: "${erupt.version}"  //后台WEB界面
  implementation group: 'xyz.erupt', name: 'erupt-tpl', version: "${erupt.version}"  //自定义模板页面模块
  implementation group: 'xyz.erupt', name: 'erupt-generator', version: "${erupt.version}"  //代码生成器模块
  implementation group: 'xyz.erupt', name: 'erupt-monitor', version: "${erupt.version}"  //服务监控模块
  implementation group: 'xyz.erupt', name: 'erupt-tpl-ui.element-ui', version: "${erupt.version}"  //模板UI库 element-ui
  implementation group: 'xyz.erupt', name: 'erupt-tpl-ui.amis', version: "${erupt.version}"  //模板UI库 amis
  implementation group: 'xyz.erupt', name: 'erupt-job', version: "${erupt.version}"  //任务管理模块
  
  //引入QueryDSL依赖
  implementation("com.querydsl:querydsl-jpa:${queryDslVersion}")
  annotationProcessor("com.querydsl:querydsl-apt:${queryDslVersion}:jpa")
  
  //erupt-dsl
  implementation group: 'com.github.wjw465150', name: 'erupt-dsl', version: "${erupt.version}"  //QueryDsl模块

}


```

