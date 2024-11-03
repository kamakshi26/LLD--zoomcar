package model;

import java.time.LocalDateTime;

import service.Status;

public class Booking {

        static int idGen = 1;

        int bookingId;
        int userId;
        String carId;
        LocalDateTime pickupTime;
        LocalDateTime dropTime;
        Location pickupLoc;
        Location dropOffLocation;
        long transactionId;
        Status status;
     
        public Booking(int userId, String carId, LocalDateTime pickupTime, LocalDateTime dropTime, Location pickupLoc,
                Location dropOffLocation, long transactionId, Status status) {
            this.bookingId=idGen++;
            this.userId = userId;
            this.carId = carId;
            this.pickupTime = pickupTime;
            this.dropTime = dropTime;
            this.pickupLoc = pickupLoc;
            this.dropOffLocation = dropOffLocation;
            this.transactionId = transactionId;
            this.status = status;
        }

        public int getBookingId() {
            return bookingId;
        }
        public void setBookingId(int bookingId) {
            this.bookingId = bookingId;
        }
        public int getUserId() {
            return userId;
        }
        public void setUserId(int userId) {
            this.userId = userId;
        }
        public String getCarId() {
            return carId;
        }
        public void setCarId(String carId) {
            this.carId = carId;
        }
        public LocalDateTime getPickupTime() {
            return pickupTime;
        }
        public void setPickupTime(LocalDateTime pickupTime) {
            this.pickupTime = pickupTime;
        }
        public LocalDateTime getDropTime() {
            return dropTime;
        }
        public void setDropTime(LocalDateTime dropTime) {
            this.dropTime = dropTime;
        }
        public Location getPickupLoc() {
            return pickupLoc;
        }
        public void setPickupLoc(Location pickupLoc) {
            this.pickupLoc = pickupLoc;
        }
        public Location getDropOffLocation() {
            return dropOffLocation;
        }
        public void setDropOffLocation(Location dropOffLocation) {
            this.dropOffLocation = dropOffLocation;
        }
        public long getTransactionId() {
            return transactionId;
        }
        public void setTransactionId(long transactionId) {
            this.transactionId = transactionId;
        }
        public Status getStatus() {
            return status;
        }
        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", carId=" + carId + ", pickupTime="
                    + pickupTime + ", dropTime=" + dropTime + "]";
        }     
        
        

}
