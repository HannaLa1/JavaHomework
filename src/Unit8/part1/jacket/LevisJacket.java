package Unit8.part1.jacket;

public class LevisJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Надеть куртку Levi's");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Levi's");
    }
}
