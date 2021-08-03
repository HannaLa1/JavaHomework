package part7.ex2;

public class Skirt extends Clothes implements WomanClothes{

    Skirt() {
        super();
    }

    Skirt(int sizeOfClothes, String size, int cost, String color, String type) {
        super(sizeOfClothes, size, cost, color, type);
    }

    @Override
    public String clotheWoman() {
        return  "Юбка";
    }
}
