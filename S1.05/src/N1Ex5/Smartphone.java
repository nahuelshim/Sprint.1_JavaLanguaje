package N1Ex5;

import java.io.Serializable;

public class Smartphone implements Serializable {

    private String brand;
    private String model;
    private int ram;

    public Smartphone(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Smartphone: " + brand + " " + model +" and have " + ram + " GB ram";
    }
}
