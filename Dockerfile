#FROM maven:3.8.3-openjdk-17
#ENV JAVA_HOME /usr/java/openjdk-17
#RUN export JAVA_HOME

#RUN mkdir -p /app
#WORKDIR /app
#COPY pom.xml /app
#COPY src/main/resources/application.properties /app
#COPY src /app/src

#RUN mvn -f pom.xml clean package

#RUN cp target/*.jar app.jar
#EXPOSE 8863

#ENTRYPOINT ["java","-jar","app.jar","--spring.config.location=application.properties"]

# Usar una imagen base con Java
FROM openjdk:17-jdk-slim

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY target/gestion_demo.jar app.jar

# Exponer el puerto que usa Spring Boot (por defecto 8080)
EXPOSE 8863

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
