FROM amazoncorretto:17
EXPOSE 8080
ADD target/SpringBootConditional-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]