# a partir de que imagen se va a crear esta imagen
FROM openjdk:11
VOLUME /tmp
# Variables de ambiente
ENV IMG_PATH=/img
EXPOSE 8080
#crea la carpeta dentro del contenedor
RUN mkdir -p /img
#se agrega el ejecutable
ADD ./target/demo-rest-0.0.1-SNAPSHOT.jar demo-rest-0.0.1-SNAPSHOT.jar
#comandos que se van a ejecutar
ENTRYPOINT ["java", "-jar", "/demo-rest-0.0.1-SNAPSHOT.jar"]