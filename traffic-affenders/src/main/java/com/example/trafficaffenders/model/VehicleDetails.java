package com.example.trafficaffenders.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Vehicle_Details")
public class VehicleDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String vehicleNo;
    private String ownerName;
    private Date purchaseDate;
    private String color;
    private String vehicleMake;

    @OneToMany(mappedBy = "vehicleDetails")
    private List<TrafficAffence> trafficAffences= new ArrayList<>();

    public VehicleDetails(String vehicleNo, String ownerName, Date purchaseDate, String color, String vehicleMake, List<TrafficAffence> trafficAffences) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
        this.purchaseDate = purchaseDate;
        this.color = color;
        this.vehicleMake = vehicleMake;
        this.trafficAffences = trafficAffences;
    }

    public VehicleDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public List<TrafficAffence> getTrafficAffences() {
        return trafficAffences;
    }

    public void setTrafficAffences(List<TrafficAffence> trafficAffences) {
        this.trafficAffences = trafficAffences;
    }

    @Override
    public String toString() {
        return "VehicleDetails{" +
                "id=" + id +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", color='" + color + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", trafficAffences=" + trafficAffences +
                '}';
    }
}
