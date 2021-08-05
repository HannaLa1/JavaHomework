package Unit6;

public class Passenger extends GroundTransport {
    private final CarBodyType bodyType;
    private final int numberOfPassengers;

    Passenger(double power, double maxSpeed, double weight, Brand brand, int numberOfWheels,
              double fuelConsumption, CarBodyType bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    private double checkFuelConsumption(double hour)
    {
        return hour * maxSpeed / fuelConsumption;
    }

    public void distance (double hour)
    {
        System.out.println("За время " + hour  + "ч, автомобиль " + brand +
                " \nдвигаясь с максимальной скоростью " + maxSpeed  + " км/ч" +
                " \nпроедет " + (hour * maxSpeed) + " км  и израсходует " + checkFuelConsumption(hour) + " литров топлива");
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------------------------" +
                "\nИнформация о легковом траспорте -->");
        super.print();
        System.out.println("Тип кузова: " + bodyType +
                "\nКоличество пассажиров: " + numberOfPassengers + "\n" +
                "-------------------------------------------------\n");
    }
}
