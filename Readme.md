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
- 