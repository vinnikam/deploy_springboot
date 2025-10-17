# Etapa 1: Construcción del JAR
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Crear directorio de trabajo
WORKDIR /app

# Copiar archivos del proyecto
COPY . .

# Compilar el proyecto y generar el JAR
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final con el JAR
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiar el JAR desde la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto por defecto de Spring Boot
EXPOSE 8863

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
