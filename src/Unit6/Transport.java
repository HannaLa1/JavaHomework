package Unit6;

public abstract class Transport {
    protected double power;
    protected double maxSpeed;
    protected double weight;
    protected Brand brand;

    Transport(double power, double maxSpeed, double weight, Brand brand)
    {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract double getPowerInKilowatts();
    public abstract void print();
}
