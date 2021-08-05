package part8.com.company.vehicles;
import part8.com.company.details.Engine;
import part8.com.company.professions.Driver;

public class SportCar extends Car{
    protected double speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine, double speed) {
        super(marka, carClass, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nПредельная скорость: " + speed +
                "\n-------------------------------------------------";
    }
}
