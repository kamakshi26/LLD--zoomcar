package service;

import java.time.LocalDateTime;
import java.util.List;

import model.Car;
import model.Location;

public class SearchService {
        private static SearchService searchService;
        InventoryService inventoryService;
        BookingService bookingService;
        private SearchService(){
            inventoryService = InventoryService.getInstance();
            bookingService = BookingService.getInstance();
        }

        public static synchronized SearchService getInstance(){
            if(searchService==null){
                searchService=new SearchService();
            }
            return searchService;
        }

        public List<Car> search(LocalDateTime pickup,LocalDateTime dropDateTime,Location loc){

            List<String> searchResult = inventoryService.search(loc);

            List<String> finalSearchResult = bookingService.availableCars(searchResult, pickup, dropDateTime);

            List<Car> carObject = inventoryService.getCars(finalSearchResult);
            
            return carObject;

        }
}
