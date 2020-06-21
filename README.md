#

# building docker image with tag sample-spring-boot-docker
* docker build . -t sample-spring-boot-docker

# listing images
* docker images

# running docker image  and exposing to a port on host machine
* docker run -p 8080:8080 -t sample-spring-boot-docker

# running docker image in detached mode
* docker run -d -p 8080:8080 -t sample-spring-boot-docker

# find running docker container
* docker ps | grep sample

# docker stats by container id
* docker stats <container id>

# Limiting resources to docker container
* docker run -d -m 700m --cpus=1 -p 8080:8080 -t sample-spring-boot-docker

# docker build arguments
* docker build --build-arg DB=jdbc:h2:mem:person . -t sample-spring-boot-docker

# env for values at runtime
* docker run -e "DB_URL=jdbc:h2:mem:person" -p 8080:8080 -t sample-spring-boot-docker

# interactive mode
* docker exec -it <container id> sh

