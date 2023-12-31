# How it Works
The aim of this project is to implement a command-message
pattern using Spring Boot using Spring WebFlux and R2DBC.

# Configurations
The project include different configurations for different 
technologies like:
- Pub/Sub
  - branch `feature/pubsub`
- Liquibase
  - branch `feature/liquibase`
- GraphQL
  - branch `feature/graphql`
- Reactive-Redis
  - branch `feature/redis`
- WebSockets(TBD)
  - branch `feature/websocket`
- Feature flags(TBD)
  - branch `feature/feature-flags`
# How to test it locally

``` bash
./gradlew clean build bootRun
```


## Prerequisites
``` bash
- Postgres
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres

- Redis
docker run -d --name my-redis-container -p 6379:6379 redis:latest
```

