package part8.com.company;
import part8.com.company.details.Engine;
import part8.com.company.professions.Driver;
import part8.com.company.vehicles.Lorry;
import part8.com.company.vehicles.SportCar;

public class Action {
    public static void main(String[] args) {
        Driver driver1 = new Driver(23, "В.И. Иванов", 3);
        Engine engine1 = new Engine(1222, "Америка");
        Lorry lorry = new Lorry("Audi", "Kuper", driver1, engine1, 453);
        System.out.println(lorry);
        lorry.start();

        Driver driver2 = new Driver(33, "А.Р. Сергеев", 5);
        Engine engine2 = new Engine(988, "Китай");
        SportCar sportCar = new SportCar("BMW", "Sedan", driver2, engine2, 500);
        System.out.println(sportCar);
        sportCar.turnLeft();
    }
}
