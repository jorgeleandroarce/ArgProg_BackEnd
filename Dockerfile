FROM amazoncorretto:17-alpine-jdk
MAINTAINER ARCEJLeandro
COPY target/Porfolio-0.0.1-SNAPSHOT.jar porfolio-app.jar
ENTRYPOINT ["java","-jar","/porfolio-app.jar"]
