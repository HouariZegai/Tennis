# Build stage
FROM maven:3.8.5-openjdk-17-slim AS build

COPY src /home/app/src
COPY pom.xml /home/app/pom.xml

WORKDIR /home/app/

RUN mvn clean package

# Package stage
FROM openjdk:17-jdk-slim

COPY --from=build /home/app/target/*-fat.jar /home/app/app.jar

CMD ["java","-jar","/home/app/app.jar"]
