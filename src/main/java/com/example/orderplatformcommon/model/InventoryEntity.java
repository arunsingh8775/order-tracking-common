package com.example.orderplatformcommon.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryEntity {

    @Id
    @Column(name = "product_id")
    @JsonAlias({"productId","product_id"})
    private String productId;

    @Column(name = "product_name")
    @JsonAlias({"productName","product_name"})
    private String productName;

    @Column(name = "available_qty")
    @JsonAlias({"availableQty","available_qty"})
    private Integer availableQty;

    @Column(name = "price", precision = 19, scale = 2)
    private BigDecimal price;
}
