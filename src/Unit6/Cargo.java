package Unit6;

public class Cargo extends GroundTransport{
    private final double loadCapacity;

    Cargo(double power, double maxSpeed, double weight, Brand brand,
          int numberOfWheels, double fuelConsumption, double loadCapacity)
    {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void checkingLoadCapacity(double capacity)
    {
        System.out.println(((capacity < loadCapacity) ? "Грузовик загружен" :
                "Вам нужен грузовик побольше!"));
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------------------------" +
                           "\nИнформация о грузовом траспорте -->");
        super.print();
        System.out.println("Грузоподъёмность (т): " + loadCapacity + "\n" +
                           "-------------------------------------------------\n");
    }
}
