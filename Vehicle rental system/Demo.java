import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import model.*;
import service.BookingService;
import service.InventoryService;
import service.SearchService;
public class Demo {
    public static void main(String[] args) {

          //  Account account1 = new Account("kamakshi@gmail.com", "brave");
         //   Account account2 = new Account("positive@gmail.com", "positive");

            Location urapakkamLocation = new Location(12.8452, 80.0676);
        Location nearUrapakkam1 = new Location(12.8460, 80.0685);
        Location nearUrapakkam2 = new Location(12.8470, 80.0665);
        
        // Other locations
      //  Location differentLocation1 = new Location(13.0827, 80.2707); // Chennai
        Location differentLocation2 = new Location(12.9716, 77.5946); // Bangalore

        Location tambaram = new Location(12.9207, 80.1272);  // Tambaram, ~8.4 km from Urapakkam
//Location medavakkam = new Location(12.9250, 80.1695); // Medavakkam, ~10 km from Urapakkam

Location vellore = new Location(12.9165, 79.1325);  // Vellore, ~130 km from Urapakkam
Location pondicherry = new Location(11.9416, 79.8083);
        
         //   User kamakshi = new User(1, "Kamakshi", 12345, urapakkamLocation, account1);
           

            Car c1=new Car("TN01AB1234", "Red", 5, "SUV", 2020, Transmission.AUTOMATIC, FuelType.PETROL, tambaram);
            Car c2=new Car("TN02CD5678", "Blue", 4, "Sedan", 2018, Transmission.MANUAL, FuelType.DIESEL, nearUrapakkam1);
            Car c3=new Car("TN03EF9012", "Black", 5, "Luxury", 2021, Transmission.AUTOMATIC, FuelType.ELECTRIC, nearUrapakkam2);
            
            // Two cars in other locations
            Car c4=new Car("KA01GH3456", "White", 5, "SUV", 2019, Transmission.MANUAL, FuelType.PETROL, vellore);
            Car c5=new Car("KA02IJ7890", "Green", 4, "Sedan", 2017, Transmission.AUTOMATIC, FuelType.DIESEL, differentLocation2);
    

                InventoryService is = InventoryService.getInstance();

                is.addNewCar(c1);
                is.addNewCar(c2);
                is.addNewCar(c3);
                is.addNewCar(c4);
                is.addNewCar(c5);

                
              //  System.out.println(is);
               

           SearchService ss = SearchService.getInstance();

          List<Car> searchRes= ss.search(LocalDateTime.now(), LocalDateTime.now().plusDays(1), urapakkamLocation);

          System.out.println(searchRes);

          BookingService bs = BookingService.getInstance();

           long starts = 1730723400000L; // Start timestamp
        long ends = 1730737800000L;   // End timestamp

        // Convert timestamps to LocalDateTime
        LocalDateTime startTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(starts), ZoneId.systemDefault());
        LocalDateTime endTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ends), ZoneId.systemDefault());

        try {
            Booking b = bs.reserve("TN03EF9012", 1, startTime, endTime, pondicherry, differentLocation2, null);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("unavailable");
        }

        LocalDateTime one = LocalDateTime.ofInstant(Instant.ofEpochMilli(1730676600000l), ZoneId.systemDefault());
        LocalDateTime two = LocalDateTime.ofInstant(Instant.ofEpochMilli(1730691000000l), ZoneId.systemDefault());

        try {
            Booking b = bs.reserve("TN03EF9012", 2, startTime, endTime, pondicherry, differentLocation2, null);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("unavailable");
        }
    }
}
