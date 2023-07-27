package com.example.archetype.model;

import lombok.Builder;

@Builder
public record Notifications(
        String accountId,
        Boolean notifications
) {
}
