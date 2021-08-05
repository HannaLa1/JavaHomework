package part8.ex3;

public class Action {
    public static void main(String[] args) {
        Cat cat = new Cat("Корм", "Беларусь", TypeOfAnimal.CAT.getType(), 2.6);
        Dog dog = new Dog("Сухой корм", "Англия", TypeOfAnimal.DOG.getType(), "Джек-рассел терьер");
        Horse horse = new Horse("Трава", "Италия", TypeOfAnimal.HORSE.getType(), "Вороная");
        Veterinarian veterinarian = new Veterinarian();
        Animal[] arr = {cat, dog, horse};

        for (Animal animal: arr)
        {
            animal.makeNoise();
            animal.sleep();
            animal.eat();
            veterinarian.treatAnimal(animal);
        }
    }
}
