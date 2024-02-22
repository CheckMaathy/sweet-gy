package com.github.checkmaathy.models;

public record Order(
        String clientName,
        String cellphone,
        String paymentType,
        String items,
        String paymentStatus,
        String deliveryStatus
) {
}
