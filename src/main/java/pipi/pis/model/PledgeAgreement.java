package pipi.pis.model;

import pipi.pis.model.enums.AgreementStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PledgeAgreement {

    private Long id;
    private Client client;
    private PledgeRequest pledgeRequest;
    private Admin createdByAdmin;
    private String itemDescription;
    private String itemCategory;
    private BigDecimal itemWeight;
    private BigDecimal appraisalValue;
    private BigDecimal loanAmount;
    private BigDecimal interestRate;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalReturnAmount;
    private AgreementStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PledgeAgreement() {
    }

    public PledgeAgreement(
            Long id,
            Client client,
            PledgeRequest pledgeRequest,
            Admin createdByAdmin,
            String itemDescription,
            String itemCategory,
            BigDecimal itemWeight,
            BigDecimal appraisalValue,
            BigDecimal loanAmount,
            BigDecimal interestRate,
            LocalDate startDate,
            LocalDate endDate,
            BigDecimal totalReturnAmount,
            AgreementStatus status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.client = client;
        this.pledgeRequest = pledgeRequest;
        this.createdByAdmin = createdByAdmin;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemWeight = itemWeight;
        this.appraisalValue = appraisalValue;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalReturnAmount = totalReturnAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public PledgeRequest getPledgeRequest() { return pledgeRequest; }
    public void setPledgeRequest(PledgeRequest pledgeRequest) { this.pledgeRequest = pledgeRequest; }

    public Admin getCreatedByAdmin() { return createdByAdmin; }
    public void setCreatedByAdmin(Admin createdByAdmin) { this.createdByAdmin = createdByAdmin; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getItemCategory() { return itemCategory; }
    public void setItemCategory(String itemCategory) { this.itemCategory = itemCategory; }

    public BigDecimal getItemWeight() { return itemWeight; }
    public void setItemWeight(BigDecimal itemWeight) { this.itemWeight = itemWeight; }

    public BigDecimal getAppraisalValue() { return appraisalValue; }
    public void setAppraisalValue(BigDecimal appraisalValue) { this.appraisalValue = appraisalValue; }

    public BigDecimal getLoanAmount() { return loanAmount; }
    public void setLoanAmount(BigDecimal loanAmount) { this.loanAmount = loanAmount; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public BigDecimal getTotalReturnAmount() { return totalReturnAmount; }
    public void setTotalReturnAmount(BigDecimal totalReturnAmount) { this.totalReturnAmount = totalReturnAmount; }

    public AgreementStatus getStatus() { return status; }
    public void setStatus(AgreementStatus status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}