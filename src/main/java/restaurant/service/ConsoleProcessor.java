package restaurant.service;

import restaurant.model.Meal;
import restaurant.model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsoleProcessor {

    private final MealService mealService;
    private final RestaurantService restaurantService;

    private final Scanner scanner = new Scanner(System.in);

    public ConsoleProcessor(MealService mealService, RestaurantService restaurantService) {
        this.mealService = mealService;
        this.restaurantService = restaurantService;
    }

    public void process() {
        List<Restaurant> restaurants = new ArrayList<>();
        List<Meal> meals = new ArrayList<>();

        restaurantService.addRestaurants(restaurants);
        String input;
        while (true) {
            restaurantService.printMenu();
            input = scanner.nextLine();


            switch (input) {
                case "exit":
                    break;


                case "1":
                    restaurantService.createRestaurant(restaurants);
                    break;


                case "2":
                    mealService.createMeal(restaurants, meals);
                    break;


                case "3":
                    restaurantService.printRestaurant(restaurants);
                    break;


                case "4":
                    mealService.printMeals(restaurants, meals);
                    break;


                case "5":
                    restaurantService.changeRestaurantName(restaurants);
                    break;


                default:
                    System.out.println("Invalid input! Please try again.");
                    break;
            }


            System.out.println();
        }

    }
}