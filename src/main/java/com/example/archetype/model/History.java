package com.example.archetype.model;

import lombok.Builder;

@Builder
public record History(
        String accountId,
        String transactionId,
        Integer amount
) {
}
