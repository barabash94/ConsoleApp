import restaurant.service.ConsoleProcessor;
import restaurant.service.MealService;
import restaurant.service.RestaurantService;

public class ConsoleApp {
     public static void main(String[] args) {
         MealService mealService = new MealService();

         RestaurantService restaurantService = new RestaurantService();

         ConsoleProcessor myservice = new ConsoleProcessor(mealService, restaurantService);
       myservice.process();

    }
}
