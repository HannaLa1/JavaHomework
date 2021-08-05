package part8.com.company.vehicles;
import part8.com.company.details.Engine;
import part8.com.company.professions.Driver;

public class Lorry extends Car{
    protected int carrying;

    public Lorry(String marka, String carClass, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nГрузоподъемность кузова: " + carrying +
                "\n-------------------------------------------------";
    }
}
