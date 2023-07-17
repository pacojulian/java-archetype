# LiquiBase Configuration

## Description
This project is a simple example of how to configure LiquiBase in a Spring Boot project.

The Project also includes how to manage context in LiquiBase.

## Files Modified
* LiquibaseInit
* ArchetypeApplication
* application-dbinit.yml
* db/changelog-master.xml
* db/postgresql/changelog/01-initial-db.xml
* db/postgresql/sql/ddl/01-db-init.sql
* db/postgresql/sql/dml/01-inserts.sql
* build.gradle


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

# How to test it locally

* Generate the jar file
``` bash
./gradlew clean build 
```
* Run the application to run the migrations.
``` bash
java -jar ./build/libs/archetype-0.0.1-SNAPSHOT.jar dbinit
```
