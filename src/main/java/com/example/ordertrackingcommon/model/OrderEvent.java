package com.example.ordertrackingcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {
    private String eventType;   // "OrderCreated", "PaymentCompleted", etc.
    private Long orderId;
    private String userId;
    private String productId;
    private Integer qty;
    private Double totalAmount;
}