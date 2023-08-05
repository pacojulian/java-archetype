package com.example.archetype.config;

import com.example.archetype.adapter.out.entity.RedisUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public ReactiveRedisTemplate<String, RedisUser> reactiveRedisTemplate(ReactiveRedisConnectionFactory factory) {
        Jackson2JsonRedisSerializer<RedisUser> serializer = new Jackson2JsonRedisSerializer<>(RedisUser.class);
        RedisSerializationContext.RedisSerializationContextBuilder<String, RedisUser> builder =
                RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
        RedisSerializationContext<String, RedisUser> context = builder.value(serializer).build();
        return new ReactiveRedisTemplate<>(factory, context);
    }
}
