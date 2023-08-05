package com.example.archetype.handler;

import com.example.archetype.adapter.out.entity.RedisUser;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import com.example.archetype.command.GetRedisInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class GetRedisInfoHandler implements Handler<GetRedisInformation, Mono<String>> {

    private final ReactiveRedisTemplate<String, RedisUser> reactiveRedisTemplate;

    @Override
    public Mono<String> handle(GetRedisInformation command) {
        String email = command.getEmail();
        return reactiveRedisTemplate.opsForValue().get(email)
                .switchIfEmpty(Mono.defer(() -> {
                    RedisUser user = RedisUser.builder().name("allan").email(email).build();
                    return reactiveRedisTemplate.opsForValue().set(email, user).thenReturn(user);
                }))
                .map(RedisUser::getName)
                .onErrorResume(ex -> Mono.just("Error: " + ex.getMessage())); // Handle any errors
    }
}
