package Unit8.part1.trousers;

public class CalvinKleinTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Надеть штаны Calvin Klein");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Calvin Klein");
    }
}
