package com.example.archetype.out.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserCommand implements Command{
    private String name;
    private String email;
    private String password;
}
