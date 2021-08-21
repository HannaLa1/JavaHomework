package Unit11.Task4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Unit11Task4 {
    public static void main(String[] args) {
        Car[] arr = {new Car(Brand.BMW, 250, 30000), new Car(Brand.NISSAN, 265, 15000),
                new Car(Brand.TESLA, 300, 120000)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Unit11/Task4/car.dat"))) {
            oos.writeObject(arr);

            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Unit11/Task4/car.dat"))) {
                Car[] cars = (Car[])ois.readObject();
                System.out.println(Arrays.toString(cars));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
