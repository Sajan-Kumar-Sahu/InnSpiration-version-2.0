# Use OpenJDK 21 base image
FROM eclipse-temurin:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files first (for layer caching)
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Give execute permission to Maven wrapper (just in case)
RUN chmod +x mvnw

# Pre-download dependencies (helps with caching)
RUN ./mvnw dependency:resolve

# Copy the remaining project files
COPY src ./src

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Expose the port Spring Boot will run on
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "target/InnSpiration-0.0.1-SNAPSHOT.jar"]
