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
# Project Structure
``` bash
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── archetype
    │   │               ├── ArchetypeApplication.java
    │   │               ├── LiquiBaseInit.java
    │   │               ├── in
    │   │               │   ├── UsersController.java
    │   │               │   └── dto
    │   │               │       ├── request
    │   │               │       │   └── CreateUserRequestDTO.java
    │   │               │       └── response
    │   │               │           └── CreateUserResponseDTO.java
    │   │               └── out
    │   │                   ├── command
    │   │                   │   ├── Command.java
    │   │                   │   └── CreateUserCommand.java
    │   │                   ├── entity
    │   │                   │   └── R2BCUser.java
    │   │                   ├── handler
    │   │                   │   ├── CreateUserHandler.java
    │   │                   │   └── Handler.java
    │   │                   ├── mapper
    │   │                   │   └── UserMapper.java
    │   │                   ├── model
    │   │                   │   └── User.java
    │   │                   └── repository
    │   │                       └── R2BCPersonRepository.java
    │   └── resources
    │       ├── application-dbinit.yml
    │       ├── application.yml
    │       └── db
    │           ├── changelog-master.xml
    │           └── postgresql
    │               ├── changelog
    │               │   └── 01-initial-db.xml
    │               └── sql
    │                   ├── ddl
    │                   │   └── 01-db-init.sql
    │                   └── dml
    │                       └── 01-inserts.sql
    └── test
        └── java
            └── com
                └── example
                    └── archetype
                        └── ArchetypeApplicationTests.java

```


``` bash

## Prerequisites
- Docker
``` bash
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```

