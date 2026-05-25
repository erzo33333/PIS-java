package pipi.pis.model;

import java.time.LocalDateTime;

public class Admin {

    private Long id;
    private User user;
    private String fullName;
    private String position;
    private LocalDateTime createdAt;

    public Admin() {
    }

    public Admin(
            Long id,
            User user,
            String fullName,
            String position,
            LocalDateTime createdAt
    ) {
        this.id = id;
        this.user = user;
        this.fullName = fullName;
        this.position = position;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}