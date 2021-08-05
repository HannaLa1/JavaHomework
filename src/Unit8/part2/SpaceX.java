package Unit8.part2;

import java.util.Random;

public class SpaceX implements IStart{

    @Override
    public boolean preLaunchCheck() {
        Random random = new Random();
        return (random.nextInt(6) + 3) > 5;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
        System.out.println("---------------------------------------------------\n");
    }
}
