package com.example.ordertrackingcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCompleted {
    private String eventType = "PaymentCompleted"; // optional, useful for logging/dispatch
    private Long orderId;
    private BigDecimal amount;
    private Instant paidAt;
}
