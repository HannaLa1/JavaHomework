package Unit8.part1.jacket;

public class ZaraJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Надеть куртку Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Zara");
    }
}
