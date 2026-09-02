package br.cantaruttim.sales_platform.user_service.model;

import java.time.LocalDate;
import java.util.UUID;

public class Users {

    private UUID id;
    private String userName;
    private String userGender;
    private LocalDate userBirthDate;
    private String userEmail;
    private String userAddress;
    private String userPhone;
    private String userFederalUnion;

    public Users() {}

    public Users(UUID id, String userName, String userGender, LocalDate userBirthDate, String userEmail, String userAddress, String userPhone, String userFederalUnion) {
        this.id = id;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthDate = userBirthDate;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userFederalUnion = userFederalUnion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public void setUserBirthDate(LocalDate userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserFederalUnion() {
        return userFederalUnion;
    }

    public void setUserFederalUnion(String userFederalUnion) {
        this.userFederalUnion = userFederalUnion;
    }

    public Integer getUserAge() {
        if (userBirthDate == null) {
            return null;
        }
        return LocalDate.now().getYear() - userBirthDate.getYear();
    }

    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userBirthDate=" + userBirthDate +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userFederalUnion='" + userFederalUnion + '\'' +
                '}';
    }

    
    
}
