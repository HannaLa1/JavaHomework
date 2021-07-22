package Unit5;
import java.util.Random;

public class Action {
    public static void main(String[] args) {

        Random rand = new Random();
        Computer device = new Computer("DESKTOP-M01BM6M", "Intel Core i5",
                "DDR4 8ГБ", "SATA до 2Тб", 6);

        System.out.println(device);
        device.on(rand.nextInt(2));
        device.off(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.off(rand.nextInt(2));
        device.off(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.off(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.off(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.on(rand.nextInt(2));
        device.off(rand.nextInt(2));
    }
}
