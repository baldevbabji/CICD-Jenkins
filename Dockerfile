FROM openjdk:17-alpine

EXPOSE 8090

COPY target/Docker-Deploy-0.0.1-SNAPSHOT.jar /Docker-Deploy.jar

CMD ["java" , "-jar", "/Docker-Deploy.jar"]