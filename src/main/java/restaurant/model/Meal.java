package restaurant.model;

public class Meal { private static int count = 1;
    private int id;
    private  String name;
    private double price;

    public Meal(String name, double price) {
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return "Meal ID: " + id + "\nName: " + name + "\nPrice: $" + price + "\n";
    }

}

