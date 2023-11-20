package restaurant.model;

public class Restaurant {private static int count = 1;
    private  int id;
    private  String name;
    private  String address;
    private  String type;

    public Restaurant(String name, String address, String type) {
        this.id = count++;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setName(String name){
        this.name= name;

    }

    public String toString() {
        return "Restaurant ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nType: " + type + "\n";
    }


    }


