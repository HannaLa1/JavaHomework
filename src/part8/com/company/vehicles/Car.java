package part8.com.company.vehicles;

import part8.com.company.details.Engine;
import part8.com.company.professions.Driver;

public class Car {
    protected String marka;
    protected String carClass;
    protected Driver driver;
    protected Engine engine;

    public Car(String marka, String carClass, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public void start()
    {
        System.out.println("Поехали");
    }

    public void stop()
    {
        System.out.println("Останавливаемся");
    }

    public void turnRight()
    {
        System.out.println("Поворот направо");
    }

    public void turnLeft()
    {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString()
    {
        return  "-------------------------------------------------" +
                "\nИнформация о машине -->" +
                "\nМарка автомобиля: " + marka +
                "\nКласс автомобиля: " + carClass +
                driver.toString() +
                engine.toString();
    }
}
