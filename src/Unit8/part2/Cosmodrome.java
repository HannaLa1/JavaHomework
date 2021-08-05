package Unit8.part2;

public class Cosmodrome {
    public void launch(IStart iStart) {
        if(iStart.preLaunchCheck()) {
            iStart.startingEngines();
            for(int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        }
        else {
            System.out.println("Предстартовая проверка провалена\n");
        }
    }
}
