# sample-spring-boot-docker Docker file usage

# Enable HyperV on windows
* https://docs.microsoft.com/en-us/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v

# Docker Installation 
* https://hub.docker.com/editions/community/docker-ce-desktop-windows

# Kitematic installation
* https://github.com/docker/kitematic/releases

# Docker reference

* https://docs.docker.com/get-started/overview/
* https://docs.docker.com/get-started/
* https://docs.docker.com/get-started/part2/
* https://docs.docker.com/get-started/part3/


# Dockerfile 
```
FROM openjdk:8-jdk-alpine
LABEL maintainer="myemail@mycompany.com"
ENV DB_URL jdbc:h2:mem:person
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

# building docker image with tag sample-spring-boot-docker
* docker build . -t sample-spring-boot-docker
* This will build docker image with tag name sample-spring-boot-docker
* Refer https://docs.docker.com/engine/reference/commandline/build/

# listing images
* docker images

# running docker image  and exposing to a port on host machine
* docker run -p 8080:8080 -t sample-spring-boot-docker

# running docker image in detached mode
* docker run -d -p 8080:8080 -t sample-spring-boot-docker
* Refer https://docs.docker.com/engine/reference/run/

# find running docker container
* docker ps | grep <imagee name>
* Refer https://docs.docker.com/engine/reference/commandline/ps/

# docker stats by container id
* docker stats <container id>
* Refer https://docs.docker.com/engine/reference/commandline/stats/

# Limiting resources to docker container
* docker run -d -m 700m --cpus=1 -p 8080:8080 -t sample-spring-boot-docker
* Refer https://docs.docker.com/engine/reference/run/#runtime-constraints-on-resources 

# docker build arguments
* Use Dockerfile below
```text
ARG img_tag
FROM openjdk:${img_tag}
LABEL maintainer="myemail@mycompany.com"
ENV DB_URL jdbc:h2:mem:person
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
* docker build --build-arg img_tag=8-jdk-alpine . -t sample-spring-boot-docker
* Refer https://docs.docker.com/engine/reference/commandline/build/#set-build-time-variables---build-arg

# env for values at runtime
* Use following Dockerfile
```text
FROM openjdk:8-jdk-alpine
LABEL maintainer="myemail@mycompany.com"
ENV DB_URL ""
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
* docker run -e "DB_URL=jdbc:h2:mem:person" -p 8080:8080 -t sample-spring-boot-docker
* Refer https://docs.docker.com/engine/reference/commandline/run/

# interactive mode
* docker exec -it <container id> sh
* Refer https://docs.docker.com/engine/reference/commandline/exec/

# docker inspect
* Refer https://docs.docker.com/engine/reference/commandline/inspect/

# Deleting docker images
* Refer https://docs.docker.com/engine/reference/commandline/rmi/




