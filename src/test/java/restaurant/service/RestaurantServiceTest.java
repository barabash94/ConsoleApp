package restaurant.service;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import restaurant.model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RestaurantServiceTest {

    private final Scanner scanner = Mockito.mock(Scanner.class);
    private final RestaurantService restaurantService= new RestaurantService(scanner);



    @Test
    void addRestaurants() {
        // given
        Restaurant e1 = new Restaurant("Kebab u Grubego", "Warszawska 11, Kraków 31-222", "TURKISH");
        var restaurants = List.of(e1);
        when(scanner.nextLine()).thenReturn( "kebab").thenReturn("krakowska").thenReturn("Asian");
        // when
        restaurantService.createRestaurant(restaurants);

        // then
assertIterableEquals(List.of(e1,new Restaurant("kebab ", "krakowska", "Asian")),restaurants );
    }
}