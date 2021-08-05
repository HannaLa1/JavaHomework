package Unit8.part1.trousers;

public class GuessTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Надеть штаны Guess");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Guess");
    }
}
