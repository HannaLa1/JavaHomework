package Unit8.part1.footwear;

public class AdidasFootwear implements Footwear{
    @Override
    public void putOn() {
        System.out.println("Надеть кеды Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кеды Adidas");
    }
}
