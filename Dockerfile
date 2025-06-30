FROM maven:3.9.8-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean install

FROM openjdk:21-slim

EXPOSE 8080

COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]