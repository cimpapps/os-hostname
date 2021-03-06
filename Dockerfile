FROM openjdk:8-jdk-alpine

WORKDIR /usr/app

COPY ./target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
