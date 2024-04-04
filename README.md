# OpenTelemetry Java Agent Example - Exception from JPA



## Prerequisites

* Java 17
* Docker compose

# How to run

Build the application jar

```shell
./mvnw clean package
```

Run the application and the collector with docker compose

```shell
docker-compose up --build
```

In a separate shell, exercise the application by calling its endpoint

```shell
curl http://localhost:8080/ping
```

Watch for spans, metrics, and logs in the collector log output
