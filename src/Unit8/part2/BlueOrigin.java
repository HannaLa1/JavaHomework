package Unit8.part2;

import java.util.Random;

public class BlueOrigin implements IStart{

    @Override
    public boolean preLaunchCheck() {
        Random random = new Random();
        return (random.nextInt(9) + 2) * 2 > 10;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Blue Origin запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Blue Origin");
        System.out.println("---------------------------------------------------\n");
    }
}
