package com.github.checkmaathy.models;

public record OrderRequestDTO(String clientName, String cellphone, String paymentType, String items) {
}
