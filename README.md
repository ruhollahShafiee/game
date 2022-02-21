# game

## Technical task test (k Games)

## Requirements

For building and running the application you need:

- [openjdk 1.8](http://www.oracle.com/technetwork/java/javase/documentation/index.html)
- [Maven 3.8.0](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `GameApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
OR

```shell
mvn clean install ; cd target ; java -jar game-0.0.1-SNAPSHOT.jar
```

The database URL is localhost:3306. if you would like this project to connect to another MySQL server please change the value of spring.datasource.url in the application.properties.


This Project will create:

* user table (id,first_name,last_name,username,password), data: [(1,"ruhollah","shafiee","1234","r.shafiee")]
* game table (id,name,code,description), data: [(1,"penalty challenge","p.c","Just shoot the ball"),(2,"magic tiles","m.t","playing the piano")]

## swagger url
http://localhost:5001/api/v1/swagger-ui.html



