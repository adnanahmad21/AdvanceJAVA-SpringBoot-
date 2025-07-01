package org.example;

public class Truck {
    int id;
 Truck(){

 }
    public Truck( String name, String model, String capacity, String driver_name) {

        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.driver_name = driver_name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", driver_name='" + driver_name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String model;
    String capacity;
    String driver_name;
}
