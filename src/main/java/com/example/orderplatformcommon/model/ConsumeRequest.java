package com.example.orderplatformcommon.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeRequest {

    @JsonAlias({"productId", "product_id"})
    private String productId;

    @JsonAlias({"qty", "quantity"})
    private Integer qty;
}
