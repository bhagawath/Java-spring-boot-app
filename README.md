# Java-spring-boot-app




# Initialize
mkdir workdir
cd workdir
git clone https://github.com/RavirahulPadmanabhan/Java-spring-boot-app.git

# Maven
./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar

# Build Docker Image
docker build -t 10.0.0.5:5000/spring-hello-world:1.0 .
