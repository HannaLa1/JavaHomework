package part8.ex3;

public class Animal {
    protected String food;
    protected String location;
    protected String typeOfAnimal;

    public Animal(String food, String location, String typeOfAnimal) {
        this.food = food;
        this.location = location;
        this.typeOfAnimal = typeOfAnimal;
    }

    public void makeNoise() {
        System.out.print(" издаёт звуки\n");
    }

    public void eat() {
        System.out.print(" ест\n");
    }

    public void sleep() {
        System.out.print(" спит\n");
    }
}
