package com.example.archetype.model;

import lombok.Builder;

@Builder
public record Contact(
        String accountId,
        String name,
        String lastName
) {
}
