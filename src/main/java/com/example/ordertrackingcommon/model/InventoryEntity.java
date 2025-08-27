package com.example.ordertrackingcommon.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor            // JPA needs a no-args ctor
public class InventoryEntity {

    @Id
    private String productId;

    private String productName;

    private Integer availableQty;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;
}
