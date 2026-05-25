package pipi.pis.model;

import pipi.pis.model.enums.InventoryStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InventoryItem {

    private Long id;
    private PledgeAgreement agreement;
    private String itemName;
    private String itemDescription;
    private String category;
    private BigDecimal estimatedPrice;
    private BigDecimal salePrice;
    private InventoryStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public InventoryItem() {
    }

    public InventoryItem(
            Long id,
            PledgeAgreement agreement,
            String itemName,
            String itemDescription,
            String category,
            BigDecimal estimatedPrice,
            BigDecimal salePrice,
            InventoryStatus status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.agreement = agreement;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.category = category;
        this.estimatedPrice = estimatedPrice;
        this.salePrice = salePrice;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public PledgeAgreement getAgreement() { return agreement; }
    public void setAgreement(PledgeAgreement agreement) { this.agreement = agreement; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public BigDecimal getEstimatedPrice() { return estimatedPrice; }
    public void setEstimatedPrice(BigDecimal estimatedPrice) { this.estimatedPrice = estimatedPrice; }

    public BigDecimal getSalePrice() { return salePrice; }
    public void setSalePrice(BigDecimal salePrice) { this.salePrice = salePrice; }

    public InventoryStatus getStatus() { return status; }
    public void setStatus(InventoryStatus status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}