FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /home/devapp
USER nobody
ENV JAVA_OPTS="-Xmx512m"
EXPOSE 8080
COPY --from=builder /app/target/*.jar app.jar
CMD ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
