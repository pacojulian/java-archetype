package com.example.archetype.adapter.in.dto.request;

public record CreateUserRequestDTO (
        String name,
        String email,
        String password){
}
