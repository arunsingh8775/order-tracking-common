package com.example.orderplatformcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentEvent {
    private String eventType;          // e.g. "ShipmentEvent"
    private Long orderId;
    private ShipmentStatus shipmentStatus;  // IN_PROGRESS, DELIVERED, CANCELLED
    private Instant eventTime;
}
