# GraphQl Configuration

## Description
The intention fo this project is to use GraphQl 
with SpringBoot 

`Note`: we are using the liquidbase config for the database migrations.
so its easier to have a local environment ready.




# Project Structure
``` bash
.
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── archetype
│   │               ├── ArchetypeApplication.java
│   │               ├── LiquiBaseInit.java
│   │               ├── adapter
│   │               │   ├── in
│   │               │   │   ├── GraphQlUserController.java
│   │               │   │   └── dto
│   │               │   │       ├── request
│   │               │   │       │   └── CreateUserRequestDTO.java
│   │               │   │       └── response
│   │               │   │           ├── CreateUserResponseDTO.java
│   │               │   │           └── UserInformationResponseDTO.java
│   │               │   └── out
│   │               │       ├── dto
│   │               │       ├── entity
│   │               │       │   └── R2BCUser.java
│   │               │       ├── exception
│   │               │       ├── mapper
│   │               │       │   └── UserMapper.java
│   │               │       └── repository
│   │               │           └── R2BCUserRepository.java
│   │               ├── command
│   │               │   ├── Command.java
│   │               │   ├── CreateUserCommand.java
│   │               │   └── GetUserInformationCommand.java
│   │               ├── handler
│   │               │   ├── CreateUserHandler.java
│   │               │   ├── GetUserInformationHandler.java
│   │               │   └── Handler.java
│   │               ├── model
│   │               │   ├── Account.java
│   │               │   ├── Address.java
│   │               │   ├── Contact.java
│   │               │   ├── History.java
│   │               │   ├── Notifications.java
│   │               │   └── User.java
│   │               └── port
│   │                   └── UserRepository.java
│   └── resources
│       ├── application-dbinit.yml
│       ├── application.yml
│       ├── db
│       │   ├── changelog-master.xml
│       │   └── postgresql
│       │       ├── changelog
│       │       │   └── 01-initial-db.xml
│       │       └── sql
│       │           ├── ddl
│       │           │   └── 01-db-init.sql
│       │           └── dml
│       │               └── 01-inserts.sql
│       └── graphql
│           └── schema.graphqls


```



# How to test it locally

* Docker
``` bash
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```

* Generate the jar file
``` bash
./gradlew clean build 
```
* Run the application to run the migrations.
``` bash
java -jar ./build/libs/archetype-0.0.1-SNAPSHOT.jar dbinit
```
