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
@NoArgsConstructor         // <-- important for JPA
@AllArgsConstructor        // (optional) handy for tests
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String userId;
    private String productId;
    private Integer qty;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;        // PENDING, COMPLETED, CANCELLED

    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus; // NOT_PAID, PAID

    private LocalDateTime paymentDate;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
