package Unit6;

public class Program {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(305.67, 230, 1670, Brand.BMW,
                4, 12.5, CarBodyType.SEDAN, 6);
        passenger.print();
        passenger.distance(2.5);

        Cargo cargo = new Cargo(210, 85, 8500, Brand.MAZ,
                4, 40.9, 7500);
        cargo.print();
        cargo.checkingLoadCapacity(6543);

        Civil civil = new Civil(175000, 550, 40789, Brand.BOEING,
                73.9, 3300, 87,true);
        civil.print();
        civil.checkingPassengerCapacity(95);

        Military military = new Military(100232, 1045,10400, Brand.MCDONNELLDOUGLAS,
                12.3, 2600, true,2);
        military.print();
        military.shot();
        military.checkingEjectionSystem();
    }
}
