package com.example.archetype.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetRedisInformation implements Command{
    private String email;
}
