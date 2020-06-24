# java-modules & springboot
Application to evaluate Java modules integration with Spring Boot.

There are 3 modules:
* api
* domain
* service

Where api is dependent on some packages from domain and service.
The main idea was to create valid module-info.java classes to define valid exports, but, which is more important even, to open valid packages to Spring to be used via reflection.

The application cannot be started via Intellij IDEA.

It needs JDK 14 to build the application

In order to run:
* mvn clean install
* java -jar api/target/api-1.0-SNAPSHOT-exec.jar
