FROM eclipse-temurin:17-jre

ADD target/app.jar /app.jar
ADD otel-javaagent/opentelemetry-javaagent-2.2.0.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -jar -javaagent:/opentelemetry-javaagent.jar /app.jar
