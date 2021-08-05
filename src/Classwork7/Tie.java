package Classwork7;

public class Tie extends Clothes implements MenClothes{

    Tie() {
        super();
    }

    Tie(int sizeOfClothes, String size, int cost, String color, String type) {
        super(sizeOfClothes, size, cost, color, type);
    }

    @Override
    public String clotheMen() {
        return "Галстук";
    }
}
