package com.example.ordertrackingcommon.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor            // JPA needs a no-args ctor
public class InventoryEntity {

    @Id
    private String productId;

    private String productName;

    private Integer availableQty;
}
