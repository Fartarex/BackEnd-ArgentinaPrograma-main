FROM amazoncorretto:19-alpine-jdk
MAINTAINER MagnaldiF 
COPY target/portafolio-0.0.1.jar  portafolio-app.jar
ENTRYPOINT ["java","-jar","/portafolio-app.jar"]