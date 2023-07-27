package com.example.archetype.model;

import lombok.Builder;

@Builder
public record Address(
        String accountId,
        String street,
        String city,
        String state,
        String zipCode
) {

}
