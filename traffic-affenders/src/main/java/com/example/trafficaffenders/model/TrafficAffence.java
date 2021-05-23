package com.example.trafficaffenders.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Traffic_Affence")
public class TrafficAffence {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String violationCode;
    private String violationComment;
    private Date  violationDate;
    private int penaltyAmount;
    private String violationPlace;

    @JsonIgnore
    @ManyToOne
    private VehicleDetails vehicleDetails;

    public TrafficAffence(long id, VehicleDetails vehicleDetails, String violationCode, String violationComment, Date violationDate, int penaltyAmount, String violationPlace) {
        this.id = id;
        this.vehicleDetails = vehicleDetails;
        this.violationCode = violationCode;
        this.violationComment = violationComment;
        this.violationDate = violationDate;
        this.penaltyAmount = penaltyAmount;
        this.violationPlace = violationPlace;
    }

    public TrafficAffence(String vehicleNo, String violationCode, String violationComment, Date violationDate, int penaltyAmount, String violationPlace) {
    //    this.vehicleNo = vehicleNo;
        this.violationCode = violationCode;
        this.violationComment = violationComment;
        this.violationDate = violationDate;
        this.penaltyAmount = penaltyAmount;
        this.violationPlace = violationPlace;
    }

    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(VehicleDetails vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public TrafficAffence() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getVehicleNo() {
//        return vehicleNo;
//    }
//
//    public void setVehicleNo(String vehicleNo) {
//        this.vehicleNo = vehicleNo;
//    }

    public String getViolationCode() {
        return violationCode;
    }

    public void setViolationCode(String violationCode) {
        this.violationCode = violationCode;
    }

    public String getViolationComment() {
        return violationComment;
    }

    public void setViolationComment(String violationComment) {
        this.violationComment = violationComment;
    }

    public Date getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(Date violationDate) {
        this.violationDate = violationDate;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public String getViolationPlace() {
        return violationPlace;
    }

    public void setViolationPlace(String violationPlace) {
        this.violationPlace = violationPlace;
    }

    @Override
    public String toString() {
        return "TrafficAffence{" +
                "id=" + id +
                ", vehicleDetails=" + vehicleDetails +
                ", violationCode='" + violationCode + '\'' +
                ", violationComment='" + violationComment + '\'' +
                ", violationDate=" + violationDate +
                ", penaltyAmount=" + penaltyAmount +
                ", violationPlace='" + violationPlace + '\'' +
                '}';
    }
}
