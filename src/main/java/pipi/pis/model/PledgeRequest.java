package pipi.pis.model;

import javafx.scene.control.ScrollToEvent;

import java.util.Date;

public class PledgeRequest {
    private int id;
    private int clientId;
    private String itemType; //enum
    private String description;
    private double desiredAmount;
    private String status;  //enum
    private Date createdAt;
    private int processedBy;
    private Date processedAt;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public String getItemType() { return itemType; }
    public void setItemType(String itemType) { this.itemType = itemType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getDesiredAmount() { return desiredAmount; }
    public void setDesiredAmount(double desiredAmount) { this.desiredAmount = desiredAmount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public int getProcessedBy() { return processedBy; }
    public void setProcessedBy(int processedBy) { this.processedBy = processedBy; }

    public Date getProcessedAt() { return processedAt; }
    public void setProcessedAt(Date processedAt) { this.processedAt = processedAt; }
}