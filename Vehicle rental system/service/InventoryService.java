package service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.*;

public class InventoryService {

        private static InventoryService inventoryService;
        BookingService BookingService;

        Map<String,Car> carInventory;

        private InventoryService(){
                carInventory = new HashMap<>();
        }

        public static synchronized InventoryService getInstance(){
            if(inventoryService==null){
                inventoryService=new InventoryService();
            }
            return inventoryService;
        }

        public void addNewCar(Car car){
            String id = car.getLicense();

            if(!carInventory.containsKey(id)){
                carInventory.put(id, car);
            }
        }

        public void remove(String carId){
            carInventory.remove(carId);
        }

        public List<String> search(Location loc){

            double lat = loc.getLatitude();
            double lng = loc.getLongitude();
            int radiusInKm = 5;

            Predicate<Car> p = new Predicate<Car>() {
                public boolean test(Car c){

                    double latitude = c.getLocation().getLatitude();
                    double longitude = c.getLocation().getLongitude();
                    double distance = Math.sqrt(Math.pow(latitude - lat, 2) + Math.pow(longitude - lng, 2)) * 111.32;

                    // Check if the distance is within the radius
                    return distance <= radiusInKm;
                    

                }
            };  

            return carInventory.values().stream().filter(p).map(i->i.getLicense()).collect(Collectors.toList());
        }

        public List<Car> getCars(List<String> ids){
            return carInventory.values().stream().filter(i->ids.contains(i.getLicense())).collect(Collectors.toList());
        }

        @Override
        public String toString() {
            return "InventoryService [carInventory=" + carInventory + "]";
        }

        

}
