package restaurant.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RestaurantTest {

    @Test
    void getType() {
        Restaurant r = new Restaurant("Boska", "Zalesie", "Italian");
        assertEquals("Italian", r.getType());
    }

    @Test
    void getName() {
        Restaurant r = new Restaurant("Boska", "Zalesie", "Italian");
        assertEquals("Boska", r.getName());

    }

    @Test
    void getAddress() {
        Restaurant r = new Restaurant("Boska", "Zalesie", "Italian");
        assertEquals("Zalesie", r.getAddress());
    }

    @Test
    void addRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Kebab u Grubego", "Warszawska 11, Kraków 31-222", "TURKISH"));
        assertEquals("Kebab u Grubego", restaurants.get(0).getName());
    }

    @Test
    public void testAddRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Kebab u grubego", "Warszawska 11, Kraków 31-222", "TURKISH"));
        restaurants.add(new Restaurant("Milano Pizza", "Sobczyka 12/3, Warszawa 33-312", "ITALIAN"));
        restaurants.add(new Restaurant("Meat Burger", "Lipowa 31b/1 Gdańsk 18-111", "AMERICAN"));


        assertEquals(3, restaurants.size());
        assertEquals("Meat Burger", restaurants.get(2).getName());
    }

    @Test
    public void IsItNull() {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Kebab u grubego", "Warszawska 11, Kraków 31-222", "TURKISH"));
        restaurants.add(new Restaurant("Milano Pizza", "Sobczyka 12/3, Warszawa 33-312", "ITALIAN"));
        restaurants.add(new Restaurant("Meat Burger", "Lipowa 31b/1 Gdańsk 18-111", "AMERICAN"));

        Assertions.assertNotNull(restaurants);

    }

}











