# Usamos una imagen oficial de Maven con JDK 21
FROM maven:3.9.6-eclipse-temurin-21

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/app

# El contenedor se mantendrá activo para que podamos ejecutar comandos desde la terminal
CMD ["tail", "-f", "/dev/null"]