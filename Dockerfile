FROM openjdk:11

EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} demo.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/demo.jar"]
