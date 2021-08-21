package Unit11.Task4;

import java.io.*;

public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Brand brand;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(Brand brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nИнформация об автомобиле:" +
                "\nМарка --> " + brand +
                "\nСкорость --> " + speed +
                "\nЦена --> " + price +
                "\n-------------------------";
    }
}
