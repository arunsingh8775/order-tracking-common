package com.example.orderplatformcommon.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class InventoryEntity {
    @JsonAlias({"productId","product_id"})
    private String productId;

    @JsonAlias({"productName","product_name"})
    private String productName;

    @JsonAlias({"availableQty","available_qty"})
    private Integer availableQty;

    private java.math.BigDecimal price;
}
