FROM maven:3.8.5-openjdk-17 AS build
COPY . .
#RUN #mvn clean package -Dskiptests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/quizapp-0.0.1-SNAPSHOT.jar quizapp.jar
#52.41.36.82
#54.191.253.12
#44.226.122.3
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "quizapp.jar"]