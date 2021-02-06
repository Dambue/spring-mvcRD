package web.config.model;

import org.springframework.context.annotation.Bean;

public class Car {
    private String manufacture;
    private String model;
    private int year;

    public Car(){

    }

    public Car(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
