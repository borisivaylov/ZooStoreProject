FROM eclipse-temurin:17 AS build
LABEL maintaner="borisivaylov@gmail.com"
WORKDIR /app
COPY . /app

RUN apt-get update && apt-get install -y maven


FROM eclipse-temurin:17
WORKDIR /app

EXPOSE 8081
COPY  --from=build app/rest/target/ZooStoreProjectApplication.jar /app/ZooStoreProjectApplication.jar
CMD [ "java", "-jar", "ZooStoreProjectApplication.jar"]



