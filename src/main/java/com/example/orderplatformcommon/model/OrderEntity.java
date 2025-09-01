package com.example.orderplatformcommon.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String userId;
    private String productId;
    private Integer qty;

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // PENDING, COMPLETED, CANCELLED

    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus; // NOT_PAID, PAID, FAILED

    private LocalDateTime paymentDate;

    // --- Shipment fields ---
    @Enumerated(EnumType.STRING)
    private ShipmentStatus shipmentStatus;  // CREATED, IN_PROGRESS, DELIVERED, CANCELLED

    private LocalDateTime shipmentDate;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
