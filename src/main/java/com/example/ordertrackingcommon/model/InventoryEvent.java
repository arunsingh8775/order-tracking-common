package com.example.ordertrackingcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryEvent {
    private String eventType;     // "InventoryEvent"
    private Long orderId;
    private String productId;
    private Integer qty;
    private InventoryStatus status;
    private Double amount;
}
