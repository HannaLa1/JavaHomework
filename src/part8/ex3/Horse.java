package part8.ex3;

public class Horse extends Animal{

    private String suit;

    public Horse(String food, String location, String typeOfAnimal, String suit) {
        super(food, location, typeOfAnimal);
        this.suit = suit;
    }

    @Override
    public void makeNoise() {
        System.out.print(typeOfAnimal);
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.print(typeOfAnimal);
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.print(typeOfAnimal);
        super.sleep();
    }
}
