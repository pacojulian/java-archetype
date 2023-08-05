# REDIS REACTIVE 

## How it Works 
The aim of this project is to use Redis in a Reactive way there is no much configuration needed and the files you need to modify/create are:
- RedisConfig.java
- RedisUser.java(Model for Redis)
- Handler/service an invoke

## RedisConfig.java
In this Config file you need to create a ReactiveRedisTemplate 
and pass the factory and the context, the context is the most 
important part because you need to pass the serializer and the 
class you want to serialize, in this case RedisUser.class 
The most important part to make it reactive is the Jackson2JsonRedisSerializer.
``` bash
    @Bean
    public ReactiveRedisTemplate<String, RedisUser> reactiveRedisTemplate(ReactiveRedisConnectionFactory factory) {
        Jackson2JsonRedisSerializer<RedisUser> serializer = new Jackson2JsonRedisSerializer<>(RedisUser.class);
        RedisSerializationContext.RedisSerializationContextBuilder<String, RedisUser> builder =
                RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
        RedisSerializationContext<String, RedisUser> context = builder.value(serializer).build();
        return new ReactiveRedisTemplate<>(factory, context);
    }
``` 
## RedisUser.java
Here you need to create the model you want to save in Redis, in this case we are saving a User.
``` bash
@RedisHash("user")
@Builder
@Data
public class RedisUser implements Serializable {
    @Id
    private String email;

    private String name;

}
```
## Handler/service an invoke
In this case we are using a Handler to save the user in Redis, the most important part is the ReactiveRedisTemplate,
``` bash
    private final ReactiveRedisTemplate<String, RedisUser> reactiveRedisTemplate;
```
Example
``` bash
    @Override
    public Mono<RedisUser> saveUser(User user) {
        RedisUser redisUser = RedisUser.builder()
                .email(user.getEmail())
                .name(user.getName())
                .build();
        return reactiveRedisTemplate.opsForValue().set(redisUser.getEmail(), redisUser);
    }
```


# Project Structure
``` bash
.
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
│   │               │       │   ├── R2BCUser.java
│   │               │       │   └── RedisUser.java
│   │               │       ├── exception
│   │               │       ├── mapper
│   │               │       │   └── UserMapper.java
│   │               │       └── repository
│   │               │           └── R2BCPersonRepository.java
│   │               ├── command
│   │               │   ├── Command.java
│   │               │   ├── CreateUserCommand.java
│   │               │   └── GetRedisInformation.java
│   │               ├── config
│   │               │   └── RedisConfig.java
│   │               ├── handler
│   │               │   ├── CreateUserHandler.java
│   │               │   ├── GetRedisInfoHandler.java
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

# How to test it locally

``` bash
./gradlew clean build bootRun
```
## Docker 
``` bash
docker run -d --name my-redis-container -p 6379:6379 redis:latest
```

