package com.example.archetype.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public record Account(
        String accountId,
        String productDetail,

        Contact contact,
        List<History> history,
        List<Address> address,
        Notifications notifications
) {
}
