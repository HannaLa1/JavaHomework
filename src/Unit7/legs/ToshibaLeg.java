package Unit7.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Движение ног Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
