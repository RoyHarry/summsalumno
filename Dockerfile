FROM openjdk:8
VOLUME /tmp
EXPOSE 8091
ADD ./target/ms-alumno-0.0.1-SNAPSHOT.jar ms-alumno.jar
ENTRYPOINT ["java","-jar","/ms-alumno.jar"]