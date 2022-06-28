FROM openjdk:17-jdk-slim

COPY target/*-fat.jar /home/app.jar

CMD ["java","-jar","/home/app.jar"]