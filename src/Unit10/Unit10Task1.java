package Unit10;

public class Unit10Task1 {
    public static void main(String[] args) {
            Car car1 = new Car(Brand.AUDI, 230, 28000);
            Car car2 = new Car(Brand.BMW, 250, 30000);
            Car car3 = new Car(Brand.NISSAN, 265, 15000);
            Car car4 = new Car(Brand.TESLA, 300, 120000);
            Car[] arr = {car1, car2, car3, car4};

            for (Car car : arr) {
                System.out.println(car);
                Unit10Task1.action(car);
            }
    }

    public static void action(Car car){
        try {
            car.start();
        }
        catch(CarException ex){
            System.out.println("Не завёлся: " + ex.getMessage());
        }
    }
}
