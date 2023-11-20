package restaurant.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, type);
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


