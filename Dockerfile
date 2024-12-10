# Use a imagem base do JDK 17
FROM openjdk:17-jdk-slim

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o artefato gerado pelo Maven para o container
COPY target/viral-clips-1.0-SNAPSHOT.jar app.jar

# Exponha a porta 8080 (ou a porta que sua aplicação usa)
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
