From [Marco's youtube Video](https://www.youtube.com/watch?v=Ybfo8Dwactg) in the talk he discusses about three Sections as below

## Section 1
Initial Setup Steps :
- Create a Maven archtype project
- Update pom to add dependencies 
- Setup the project structure [Refer](https://stackoverflow.com/questions/10654120/error-could-not-find-or-load-main-class-in-intellij-ide)
- Create a simple class with main method
- Run the class

Set up Tomcat Server:
- Update pom.xml to add tomcat plugin from [here](https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-core/8.5.37)
- Maven Reload the project 
- Run the class with tomcat plugin

Refer the starter codebases here 
- [Github spring starter Codebase](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-starters/spring-boot-starter-tomcat/build.gradle)
- Code has changed from pom to gradle, but the dependencies remain the same
- Refer the dependencies from the above link and add them to your pom.xml

## Section 2

- [External Spring Config](https://docs.spring.io/spring-boot/reference/features/external-config.html)
- Add properties file to the project
- Add Conditional Bean creation based on the properties
- Add Maven dependency for jdbc and h2

## Section 3
- [AutoConfigure Module](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/build.gradle)
- [AutoConfigure Each lib list](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure)
- [SprinBootApplication](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/SpringBootApplication.java) Consist of 
  - Among others important ones are 
    - EnableAutoConfiguration
    - ComponentScan
    - Above two means that Springboot scans all [Autoconfigure](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure) for classes that are called autoConfiguration 
      - e.g. [aop](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/aop/AopAutoConfiguration.java)
      - [cassandra](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/cassandra/CassandraAutoConfiguration.java)
      - [jdbc](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java) 
        - Similar to what we did
    - Conditionl Code reference 
    - [ConditionalOnJava](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/condition/ConditionalOnJava.java
  - Discussion on [JDBC AutoConfiguration](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java)
  - [Hikari](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration.java)
  - [Webserver Tomcat](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/embedded/EmbeddedWebServerFactoryCustomizerAutoConfiguration.java)
  - [Tomcat Setup in spring code](https://github.com/spring-projects/spring-boot/blob/9def6f86c9f88c405f302d9e044d5ea463cfe1f5/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/tomcat/TomcatWebServer.java#L116) that we did 
    - [Thread startup](https://github.com/spring-projects/spring-boot/blob/9def6f86c9f88c405f302d9e044d5ea463cfe1f5/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/tomcat/TomcatWebServer.java#L214)
