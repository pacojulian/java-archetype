package com.example.archetype.adapter.out.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@RedisHash("user")
@Builder
@Data
public class RedisUser implements Serializable {
    @Id
    private String email;

    private String name;

}
