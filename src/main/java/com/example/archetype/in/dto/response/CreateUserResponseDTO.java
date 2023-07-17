package com.example.archetype.in.dto.response;

import lombok.Builder;

@Builder
public record CreateUserResponseDTO(
        String message
) {
}
