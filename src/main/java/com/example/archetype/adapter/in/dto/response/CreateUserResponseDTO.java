package com.example.archetype.adapter.in.dto.response;

import lombok.Builder;

@Builder
public record CreateUserResponseDTO(
        String message
) {
}
