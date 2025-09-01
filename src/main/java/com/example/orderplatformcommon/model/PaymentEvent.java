package com.example.orderplatformcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEvent {
    private String eventType;        // "PaymentEvent"
    private Long orderId;
    private BigDecimal amount;
    private PaymentStatus status;    // SUCCESS, FAILED
    private Instant eventTime;
}
