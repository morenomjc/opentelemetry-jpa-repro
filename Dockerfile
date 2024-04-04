FROM eclipse-temurin:17-jre

ADD target/app.jar /app.jar
ADD target/agent/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -jar -javaagent:/opentelemetry-javaagent.jar /app.jar
