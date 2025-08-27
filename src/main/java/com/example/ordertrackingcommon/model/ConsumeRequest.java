package com.example.ordertrackingcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeRequest {
    private String productId;
    private Integer qty;
}
