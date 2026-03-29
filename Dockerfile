FROM openjdk:21-temurin
EXPOSE 8080
COPY target/github-docker-cicd.jar github-docker-cicd.jar
ENTRYPOINT ["java", "-jar", "github-docker-cicd.jar"]
