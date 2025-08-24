package com.example.ordertrackingcommon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "inventory")
@Data
public class InventoryEntity {

    @Id
    @Column(name = "product_id", unique = true, nullable = false)
    @NotBlank
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "available_qty")
    @Min(0)
    private Integer availableQty;

    @Column(name = "price")
    @Min(0)
    private BigDecimal price;
}
