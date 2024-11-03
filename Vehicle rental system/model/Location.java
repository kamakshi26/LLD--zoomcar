package model;

public class Location {
    double latitude;
    double longitude;
    // String country;
    // String state;
    // String city;
    // String area;
    // String street;
    // int id; // user home number, car parked location number
    // long zipcode;

    
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    // public String getCountry() {
    //     return country;
    // }
    // public void setCountry(String country) {
    //     this.country = country;
    // }
    // public String getState() {
    //     return state;
    // }
    // public void setState(String state) {
    //     this.state = state;
    // }
    // public String getCity() {
    //     return city;
    // }
    // public void setCity(String city) {
    //     this.city = city;
    // }
    // public String getArea() {
    //     return area;
    // }
    // public void setArea(String area) {
    //     this.area = area;
    // }
    // public String getStreet() {
    //     return street;
    // }
    // public void setStreet(String street) {
    //     this.street = street;
    // }
    // public int getId() {
    //     return id;
    // }
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public long getZipcode() {
    //     return zipcode;
    // }
    // public void setZipcode(long zipcode) {
    //     this.zipcode = zipcode;
    // }
    @Override
    public String toString() {
        return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
    }
    

    

    

    
}
