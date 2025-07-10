FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN ./mvnw package -DskipTests || mvn package -DskipTests

CMD ["java", "-jar", "target/billing-service-1.0.0.jar"]
