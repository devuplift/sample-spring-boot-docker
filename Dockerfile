FROM openjdk:8-jdk-alpine
LABEL maintainer="myemail@mycompany.com"
#ARG DB
ENV DB_URL ""
#ENV DB_URL jdbc:h2:mem:person
ARG JAR_FILE=target/sample-spring-boot-docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]