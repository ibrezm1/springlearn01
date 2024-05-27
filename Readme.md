### [Watch Marco's YouTube Video](https://www.youtube.com/watch?v=Ybfo8Dwactg)

### Section 1: Initial Setup

#### Initial Project Setup:
- Create a Maven archetype project.
- Update the `pom.xml` to add dependencies.
- Structure the project accordingly. [Refer to Stack Overflow for help](https://stackoverflow.com/questions/10654120/error-could-not-find-or-load-main-class-in-intellij-ide).
- Create a simple class with a main method.
- Run the class.

#### Setting up Tomcat Server:
- Update the `pom.xml` to add the Tomcat plugin. [Here's the plugin](https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-core/8.5.37).
- Reload the Maven project.
- Run the class with the Tomcat plugin.

#### Starter Codebases:
- Access the starter codebases on GitHub.
  - [GitHub Spring Starter Codebase](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-starters/spring-boot-starter-tomcat/build.gradle)
  - Code has transitioned from `pom.xml` to Gradle, but the dependencies remain the same.
  - Refer to the dependencies from the provided link and add them to your `pom.xml`.

### Section 2: External Spring Config

- [External Spring Config Documentation](https://docs.spring.io/spring-boot/reference/features/external-config.html)
- Add a properties file to the project.
- Implement Conditional Bean creation based on the properties.
- Add Maven dependencies for JDBC and H2.

### Section 3: AutoConfigure Module

- [AutoConfigure Module](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/build.gradle)
- [List of AutoConfigure Libraries](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure)
- [SprinBootApplication Class](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/SpringBootApplication.java) consists of:
  - Important annotations such as `@EnableAutoConfiguration` and `@ComponentScan`.
  - Discussion on various `AutoConfiguration` classes.
  - Example: [JDBC AutoConfiguration](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java).
  - [Hikari](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration.java).
  - [Webserver Tomcat](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/embedded/EmbeddedWebServerFactoryCustomizerAutoConfiguration.java).
  - [Tomcat Setup in Spring Code](https://github.com/spring-projects/spring-boot/blob/9def6f86c9f88c405f302d9e044d5ea463cfe1f5/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/tomcat/TomcatWebServer.java#L116).
    - [Thread Startup](https://github.com/spring-projects/spring-boot/blob/9def6f86c9f88c405f302d9e044d5ea463cfe1f5/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/tomcat/TomcatWebServer.java#L214).
   
## What’s next

### What is Spring Framework?
Learn about the basics and core concepts of the Spring Framework.
- [What is Spring Framework?](https://www.marcobehler.com/guides/spring-framework)

### What is Spring MVC: @Controllers & RestControllers
Understand the role of controllers and RestControllers in Spring MVC.
- [What is Spring MVC: @Controllers & RestControllers](https://www.marcobehler.com/guides/spring-mvc)

### How Spring Boot’s Autoconfigurations Work
Discover how Spring Boot’s autoconfiguration mechanism operates.
- [How Spring Boot’s Autoconfigurations Work](https://www.marcobehler.com/guides/spring-boot)

### Spring Crash Course
Marco's Crash course 
- [Course on Spring Crash](https://www.youtube.com/watch?v=QuvS_VLbGko)
