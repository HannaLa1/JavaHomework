package Classwork7;

public class Shirt extends Clothes implements MenClothes, WomanClothes{

    Shirt() {
        super();
    }

    Shirt(int sizeOfClothes, String size, int cost, String color, String type) {
        super(sizeOfClothes, size, cost, color, type);
    }

    @Override
    public String clotheMen() {
        return "Мужская майка";
    }

    @Override
    public String clotheWoman() {
        return "Женская майка";
    }
}
