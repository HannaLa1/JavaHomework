package Unit6;

public abstract class AirTransport extends Transport{
    protected double wingspan;
    protected int minRunwayLength;

    AirTransport(double power, double maxSpeed, double weight,
                 Brand brand, double wingspan, int minRunwayLength)
    {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void print() {
        System.out.println("\nМощность (в лошадиных силах): " + power +
                "\nМаксимальная скорость (км/ч): " + maxSpeed +
                "\nМасса (кг): " + weight +
                "\nМарка: " + brand +
                "\nРазмах крыльев (м): " + wingspan +
                "\nМинимальная длина взлётно-посадочной полосы для взлёта: " + minRunwayLength +
                "\nМощность в киловаттах (кВ): " + getPowerInKilowatts());
    }

    @Override
    public double getPowerInKilowatts() {
        return 0.74 * power;
    }
}
