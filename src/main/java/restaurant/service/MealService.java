package restaurant.service;

import restaurant.model.Meal;
import restaurant.model.Restaurant;

import java.util.List;
import java.util.Scanner;

public class MealService {

    Scanner scanner = new Scanner(System.in);
    private int restaurantId;


    public MealService() {
    }

    public void printMeals(List<Restaurant> restaurants, List<Meal> meals) {
        System.out.print("Enter the restaurant id: ");
        scanner.nextLine();

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                System.out.println("Meals in " + restaurant.getName() + ":");
                for (Meal meal : meals) {
                    System.out.println(meal);
                }
                break;
            }
        }
    }

    public void createMeal(List<Restaurant> restaurants, List<Meal> meals) {
        System.out.print("Enter the meal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the meal price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the restaurant id to add the meal: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();
        for (Restaurant restaurant : restaurants)
            if (restaurant.getId() == restaurantId) {
                meals.add(new Meal(name, price));
                System.out.println("Meal added to the restaurant successfully!");
            }
    }
}

