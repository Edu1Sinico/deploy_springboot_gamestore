FROM ubuntu:latest AS build

# Instale o OpenJDK
RUN apt-get update && apt-get install -y openjdk-17-jdk

COPY . .

RUN apt-get install maven -y

RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

# Copie o arquivo JAR da aplicação para o contêiner
COPY --from=built /target/gamestore.jar /app.jar

# Defina o comando de inicialização da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
