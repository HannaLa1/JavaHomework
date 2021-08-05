package part8.ex3;

public class Cat extends Animal{
    private double weight;

    public Cat(String food, String location, String typeOfAnimal, double weight) {
        super(food, location, typeOfAnimal);
        this.weight = weight;
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
