package com.example.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record RequestProduct(
        String id,

        @NotBlank
        String name,
        @NotNull
        Integer price_in_cents
) {
}
