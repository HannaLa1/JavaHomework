package Unit6;

public abstract class GroundTransport extends Transport{
    protected int numberOfWheels;
    protected double fuelConsumption;

    GroundTransport(double power, double maxSpeed, double weight, Brand brand,
                    int numberOfWheels, double fuelConsumption)
    {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getPowerInKilowatts() {
        return 0.74 * power;
    }

    @Override
    public void print() {
        System.out.println("\nМощность (в лошадиных силах): " + power +
                           "\nМаксимальная скорость (км/ч): " + maxSpeed +
                           "\nМасса (кг): " + weight +
                           "\nМарка: " + brand +
                           "\nКоличество колёс: " + numberOfWheels +
                           "\nРасход топлива (л/100км): " + fuelConsumption +
                           "\nМощность в киловаттах (кВ): " + getPowerInKilowatts());
    }
}
