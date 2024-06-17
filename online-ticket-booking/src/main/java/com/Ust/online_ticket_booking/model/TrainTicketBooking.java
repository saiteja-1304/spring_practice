package com.Ust.online_ticket_booking.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainTicketBooking {
    @Id
    @GeneratedValue
    private int id;
    private String trainName;
    private String trainSource;
    private String trainDestination;
    private String trainDepartureTime;
    private String trainArrivalTime;
    private String trainPrice;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private String userCity;
    private String userState;
    private String userCountry;
    private String userZip;
    private String userGender;
    private String userAge;
    private String userPassword;


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainSource() {
        return trainSource;
    }

    public void setTrainSource(String trainSource) {
        this.trainSource = trainSource;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public String getTrainDepartureTime() {
        return trainDepartureTime;
    }

    public void setTrainDepartureTime(String trainDepartureTime) {
        this.trainDepartureTime = trainDepartureTime;
    }

    public String getTrainArrivalTime() {
        return trainArrivalTime;
    }

    public void setTrainArrivalTime(String trainArrivalTime) {
        this.trainArrivalTime = trainArrivalTime;
    }

    public String getTrainPrice() {
        return trainPrice;
    }

    public void setTrainPrice(String trainPrice) {
        this.trainPrice = trainPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserZip() {
        return userZip;
    }

    public void setUserZip(String userZip) {
        this.userZip = userZip;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
