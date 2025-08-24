package com.example.ordertrackingcommon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import javax.xml.validation.Schema;

@Entity
@Table(name = "inventory")
@Schema(description = "Inventory record for a product")
public class InventoryEntity {

    @Id
    @Column(name = "product_id", unique = true, nullable = false)
    @NotBlank
    @Schema(description = "Unique product identifier", example = "P001", requiredMode = Schema.RequiredMode.REQUIRED)
    private String productId;

    @Column(name = "product_name")
    @Schema(description = "Human-readable product name", example = "Wireless Mouse")
    private String productName;

    @Column(name = "available_qty")
    @Min(0)
    @Schema(description = "Available quantity in stock", example = "120", minimum = "0")
    private Integer availableQty;

    @Column(name = "price")
    @Min(0)
    @Schema(description = "Unit price of the product", example = "499.99", minimum = "0")
    private Double price;

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Integer getAvailableQty() { return availableQty; }
    public void setAvailableQty(Integer availableQty) { this.availableQty = availableQty; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
