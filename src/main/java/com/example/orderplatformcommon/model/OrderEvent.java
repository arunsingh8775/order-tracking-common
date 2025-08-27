package com.example.orderplatformcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {
    private String eventType;   // "OrderCreated",
    private Long orderId;
    private String userId;
    private String productId;
    private Integer qty;
    private BigDecimal totalAmount;
}