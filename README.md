# Java-Spring-Boot-App

# Initialize
mkdir workdir && cd workdir && git clone https://github.com/RavirahulPadmanabhan/Java-spring-boot-app.git && cd Java-spring-boot-app

# Maven
./mvnw package

# Build Docker Image
docker build -t 10.0.0.5:5000/spring-hello-world:1.0 .
