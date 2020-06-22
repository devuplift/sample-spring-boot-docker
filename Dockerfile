# README.md file for Dockerfile sampples

FROM openjdk:8-jdk-alpine
LABEL maintainer="myemail@mycompany.com"
ENV DB_URL jdbc:h2:mem:person
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]