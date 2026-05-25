package pipi.pis.model;

import pipi.pis.model.enums.PledgeRequestStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PledgeRequest {

    private Long id;
    private Client client;
    private String itemType;
    private String itemDescription;
    private BigDecimal desiredLoanAmount;
    private PledgeRequestStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PledgeRequest() {
    }

    public PledgeRequest(
            Long id,
            Client client,
            String itemType,
            String itemDescription,
            BigDecimal desiredLoanAmount,
            PledgeRequestStatus status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.client = client;
        this.itemType = itemType;
        this.itemDescription = itemDescription;
        this.desiredLoanAmount = desiredLoanAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getItemType() { return itemType; }
    public void setItemType(String itemType) { this.itemType = itemType; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public BigDecimal getDesiredLoanAmount() { return desiredLoanAmount; }
    public void setDesiredLoanAmount(BigDecimal desiredLoanAmount) { this.desiredLoanAmount = desiredLoanAmount; }

    public PledgeRequestStatus getStatus() { return status; }
    public void setStatus(PledgeRequestStatus status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}