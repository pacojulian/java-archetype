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
.
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── archetype
    │   │               ├── ArchetypeApplication.java
    │   │               ├── adapter
    │   │               │   ├── in
    │   │               │   │   ├── UsersController.java
    │   │               │   │   └── dto
    │   │               │   │       ├── request
    │   │               │   │       │   └── CreateUserRequestDTO.java
    │   │               │   │       └── response
    │   │               │   │           └── CreateUserResponseDTO.java
    │   │               │   └── out
    │   │               │       ├── dto
    │   │               │       ├── entity
    │   │               │       │   └── R2BCUser.java
    │   │               │       ├── exception
    │   │               │       ├── mapper
    │   │               │       │   └── UserMapper.java
    │   │               │       └── repository
    │   │               │           └── R2BCPersonRepository.java
    │   │               ├── command
    │   │               │   ├── Command.java
    │   │               │   └── CreateUserCommand.java
    │   │               ├── handler
    │   │               │   ├── CreateUserHandler.java
    │   │               │   └── Handler.java
    │   │               ├── model
    │   │               │   └── User.java
    │   │               └── port
    │   │                   └── UserRepository.java
    │   └── resources
    │       └── application.yml
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

