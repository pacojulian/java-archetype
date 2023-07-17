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
- Feature flags(TBD)
  - branch `feature/feature-flags`
- GraphQL(TBD)
  - branch `feature/graphql`
- WebSockets(TBD)
  - branch `feature/websocket`
# How to test it locally

``` bash
./gradlew clean build bootRun
```


``` bash

## Prerequisites
- Docker
``` bash
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```

