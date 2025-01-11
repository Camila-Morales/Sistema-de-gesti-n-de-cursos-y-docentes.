# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

# Establece un directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo .jar en el contenedor
COPY cursos.jar app.jar

# Expone el puerto que usa tu aplicación (generalmente 8080)
EXPOSE 8002

# Comando para ejecutar tu aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
