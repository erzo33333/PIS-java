package pipi.pis.model;

import pipi.pis.model.enums.VerificationStatus;

import java.time.LocalDateTime;

public class Client {

    private Long id;
    private User user;
    private String fullName;
    private String phone;
    private String passport;
    private String registrationAddress;
    private VerificationStatus verificationStatus;
    private String passportMainPhotoPath;
    private String passportRegistrationPhotoPath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Client() {
    }

    public Client(
            Long id,
            User user,
            String fullName,
            String phone,
            String passport,
            String registrationAddress,
            VerificationStatus verificationStatus,
            String passportMainPhotoPath,
            String passportRegistrationPhotoPath,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.user = user;
        this.fullName = fullName;
        this.phone = phone;
        this.passport = passport;
        this.registrationAddress = registrationAddress;
        this.verificationStatus = verificationStatus;
        this.passportMainPhotoPath = passportMainPhotoPath;
        this.passportRegistrationPhotoPath = passportRegistrationPhotoPath;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassport() { return passport; }
    public void setPassport(String passport) { this.passport = passport; }

    public String getRegistrationAddress() { return registrationAddress; }
    public void setRegistrationAddress(String registrationAddress) { this.registrationAddress = registrationAddress; }

    public VerificationStatus getVerificationStatus() { return verificationStatus; }
    public void setVerificationStatus(VerificationStatus verificationStatus) { this.verificationStatus = verificationStatus; }

    public String getPassportMainPhotoPath() { return passportMainPhotoPath; }
    public void setPassportMainPhotoPath(String passportMainPhotoPath) { this.passportMainPhotoPath = passportMainPhotoPath; }

    public String getPassportRegistrationPhotoPath() { return passportRegistrationPhotoPath; }
    public void setPassportRegistrationPhotoPath(String passportRegistrationPhotoPath) { this.passportRegistrationPhotoPath = passportRegistrationPhotoPath; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}