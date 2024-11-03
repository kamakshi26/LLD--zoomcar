package model;
import java.util.*;

public class Car {
    String license;
    String color;
    int seats;
    String carType; //suv,sedan,luxury
    int model;
    Transmission transmission;
    FuelType fuelType;
    int avgRatings;
    List<Review> reviews;
    Location location;
    //List<String> s3Urls; - images;
    public Car(String license, String color, int seats, String carType, int model, Transmission transmission,
            FuelType fuelType,Location location) {
        this.license = license;
        this.color = color;
        this.seats = seats;
        this.carType = carType;
        this.model = model;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.location=location;
    }
    public String getLicense() {
        return license;
    }
    
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public Transmission getTransmission() {
        return transmission;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public int getAvgRatings() {
        return avgRatings;
    }
    public void setAvgRatings(int avgRatings) {
        this.avgRatings = avgRatings;
    }
    public List<Review> getReviews() {
        return reviews;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    @Override
    public String toString() {
        return license;
    }


    
}
