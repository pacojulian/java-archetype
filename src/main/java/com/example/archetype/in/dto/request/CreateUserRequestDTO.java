package com.example.archetype.in.dto.request;

public record CreateUserRequestDTO (
        String name,
        String email,
        String password){
}
