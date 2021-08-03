package part7.ex2;

public class Trousers extends Clothes implements MenClothes, WomanClothes{

    Trousers() {
        super();
    }

    Trousers(int sizeOfClothes, String size, int cost, String color, String type) {
        super(sizeOfClothes, size, cost, color, type);
    }

    @Override
    public String clotheMen() {
        return "Мужские штаны";
    }

    @Override
    public String clotheWoman() {
        return "Женские штаны";
    }
}
