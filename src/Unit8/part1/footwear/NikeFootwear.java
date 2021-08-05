package Unit8.part1.footwear;

public class NikeFootwear implements Footwear{
    @Override
    public void putOn() {
        System.out.println("Надеть кроссовки Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кроссовки Nike");
    }
}
