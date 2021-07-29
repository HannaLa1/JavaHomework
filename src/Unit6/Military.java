package Unit6;

public class Military extends AirTransport{
    private final boolean ejectionSystem;
    private final int numberOfMissiles;

    Military(double power, double maxSpeed, double weight, Brand brand,
             double wingspan, int minRunwayLength, boolean ejectionSystem, int numberOfMissiles)
    {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void shot()
    {
        System.out.println(((numberOfMissiles > 0) ? "Ракета пошла..." : "Боеприпасы отсутствуют!"));
    }

    public void checkingEjectionSystem()
    {
        System.out.println(((ejectionSystem) ? "Катапультирование прошло успешно\n" :
                "У вас нет такой системы!\n"));
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------------------------" +
                "\nИнформация о военном траспорте -->");
        super.print();
        System.out.println("Наличие системы катапультирования: " + ((ejectionSystem) ? "Есть" : "Нет") +
                "\nКоличество ракет на борту: " + numberOfMissiles + "\n" +
                "-------------------------------------------------\n");
    }
}
