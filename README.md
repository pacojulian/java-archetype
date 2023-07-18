# GraphQl Configuration

## Description
The intention fo this project is to use GraphQl 
with SpringBoot 

`Note`: we are using the liquidbase config for the database migrations.
so its easier to have a local environment ready.




# Project Structure
``` bash
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
