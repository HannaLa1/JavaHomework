package Unit6;

public class Civil extends AirTransport{
    private final int numberOfPassengers;
    private final boolean businessClass;

    Civil(double power, double maxSpeed, double weight, Brand brand, double wingspan,
          int minRunwayLength, int numberOfPassengers, boolean businessClass)
    {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public void checkingPassengerCapacity(int capacity)
    {
        System.out.println(((capacity < numberOfPassengers) ? "Самолет заполнен" :
                "Нужен самолёт большей вместимости!"));
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------------------------" +
                "\nИнформация о гражданском траспорте -->");
        super.print();
        System.out.println("Количество пассажиров: " + numberOfPassengers +
                "\nНаличие бизнес класса: " + ((businessClass) ? "Есть" :
                "Нет") + "\n" +
                "-------------------------------------------------\n");
    }
}
