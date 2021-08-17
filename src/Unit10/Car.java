package Unit10;

import java.util.Random;

public class Car {
    private Brand brand;
    private int speed;
    private int price;
    Random random = new Random();

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

    public void start() throws CarException {
        if (random.nextInt(21) % 2 == 0){
            throw new CarException("полученное число оказалось нечётным!");
        }else{
            System.out.println("Aвтомобиль " + brand + " завёлся!");
        }
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
