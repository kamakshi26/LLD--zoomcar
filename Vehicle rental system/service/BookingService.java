package service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Booking;
import model.Location;
import model.PaymentInfo;

public class BookingService {

         private static BookingService bookingService;

         Map<Integer,Booking> bookings;

        private BookingService(){
               bookings = new HashMap<>();
        }

        public static synchronized BookingService getInstance(){
            if(bookingService==null){
                bookingService=new BookingService();
            }
            return bookingService;
        }

        public Booking reserve(String carId,int userId,LocalDateTime pickupTime,
        LocalDateTime dropTime,Location pickupLocation,
        Location dropLocation,PaymentInfo paymentDetails) throws UnavailabilityException{

            //start transaction
            Booking bookingObj;

            List<String> isAvailable = availableCars(Arrays.asList(carId), pickupTime, dropTime);
            if(isAvailable!=null){
                //make payment

                System.out.println("upi ? card ? wallet?");
                // create booking and update it in db
                int transactionId=0; // 
                bookingObj = new Booking(userId, carId, pickupTime, dropTime, pickupLocation, dropLocation, transactionId, Status.RESERVED_PAYMENT_NOT_DONE);
                bookings.put(bookingObj.getBookingId(), bookingObj);
            }else{
                throw new UnavailabilityException("the car you chose is unavailable now. please choose different car");
            }

            //end transaction

            return bookingObj;
        }


        public List<String> availableCars(List<String> carIds,LocalDateTime pickup,LocalDateTime dropOff){
            
            List<Integer> carBookings = bookings.values().stream().filter(i->carIds.contains(i.getCarId())).map(obj -> obj.getBookingId()).toList();

            for(Integer id : carBookings){

                    Booking booking = bookings.get(id);
                    
                    LocalDateTime pick = booking.getPickupTime();
                    LocalDateTime drop = booking.getDropTime();

                   if(isOverLapping(pickup, dropOff, pick, drop)){
                        carIds.remove(booking.getCarId());
                   }

               
            }

            return carIds;
        }

        public boolean isOverLapping(LocalDateTime pickup,LocalDateTime dropOff,LocalDateTime pick,LocalDateTime drop){
           return !(pickup.isAfter(drop) || dropOff.isBefore(pick));
        }

}
