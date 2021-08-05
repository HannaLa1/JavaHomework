package part8.ex3;

public class Dog extends Animal{

    private String breed;

    public Dog(String food, String location, String typeOfAnimal, String breed) {
        super(food, location, typeOfAnimal);
        this.breed = breed;
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
