package restaurant.service;

import org.jetbrains.annotations.NotNull;
import restaurant.model.Restaurant;

import java.util.List;
import java.util.Scanner;

public class RestaurantService {

    Scanner scanner= new Scanner (System.in);

    public RestaurantService(){

    }


    public void changeRestaurantName(List<Restaurant> restaurants) {
        System.out.print("Enter the restaurant id: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                System.out.print("Enter the new name for " + restaurant.getName() + ": ");
                String newName = scanner.nextLine();
                restaurant.setName(newName);
                System.out.println("Restaurant name changed successfully!");
                break;
            }
        }
    }

    void printRestaurant(List<Restaurant> restaurants) {
        System.out.println("All Restaurants:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }


    public void createRestaurant(@NotNull List<Restaurant> restaurants) {
        System.out.print("Enter the restaurant name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the restaurant address: ");
        String address = scanner.nextLine();
        System.out.print("Enter the restaurant type (ASIAN, ITALIAN, FRENCH, AMERICAN, TURKISH): ");
        String type = scanner.nextLine();
        if (isValidRestaurantType(type)) {
            restaurants.add(new Restaurant(name, address, type));
            System.out.println("Restaurant added successfully!");
        } else {
            System.out.println("Invalid restaurant type entered!");
        }
    }

    private boolean isValidRestaurantType(String type) {
        return type.equalsIgnoreCase("ASIAN") ||
                type.equalsIgnoreCase("ITALIAN") ||
                type.equalsIgnoreCase("FRENCH") ||
                type.equalsIgnoreCase("AMERICAN") ||
                type.equalsIgnoreCase("TURKISH");
    }


        public void printMenu () {
            System.out.println("Type a number to select an option:");
            System.out.println("1. Create a restaurant");
            System.out.println("2. Add a meal to a restaurant");
            System.out.println("3. Show all restaurants");
            System.out.println("4. Show meals in a specific restaurant");
            System.out.println("5. Change restaurant name");
            System.out.println("Type 'exit' to exit");
        }

        public void addRestaurants (List < Restaurant > restaurants) {
            restaurants.add(new Restaurant("Kebab u grubego", "Warszawska 11, Kraków 31-222", "TURKISH"));
            restaurants.add(new Restaurant("Milano Pizza", "Sobczyka 12/3, Warszawa 33-312", "ITALIAN"));
            restaurants.add(new Restaurant("Meat Burger", "Lipowa 31b/1 Gdańsk 18-111", "AMERICAN"));
        }

    }





