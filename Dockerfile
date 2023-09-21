
FROM maven:3.8.3-openjdk-17 AS build

WORKDIR /app/marketplace

COPY . .

RUN mvn clean package

FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY --from=build /app/marketplace/target/marketplace-0.0.1-SNAPSHOT.jar marketplace.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","marketplace.jar"]