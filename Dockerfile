FROM eclipse-temurin:21-jdk
EXPOSE 8080
COPY target/github-docker-cicd.jar github-docker-cicd.jar
ENTRYPOINT ["java", "-jar", "github-docker-cicd.jar"]
