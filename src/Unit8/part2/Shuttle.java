package Unit8.part2;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean preLaunchCheck() {
        Random random = new Random();
        return random.nextInt(11) > 3;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
        System.out.println("---------------------------------------------------\n");
    }
}
