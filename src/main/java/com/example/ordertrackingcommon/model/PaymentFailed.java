package com.example.ordertrackingcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentFailed {
    private String eventType = "PaymentFailed"; // optional
    private Long orderId;
    private String reason;   // e.g., "Insufficient funds" / "Inventory failure"
    private Instant failedAt;
}
