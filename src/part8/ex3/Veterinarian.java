package part8.ex3;

public class Veterinarian {

    public void treatAnimal(Animal animal)
    {
        System.out.println("На приёме у ветеринара -->");
        System.out.println("Питание --> " + animal.food);
        System.out.println("Место обитания --> " + animal.location);
        System.out.println("----------------------------\n");
    }
}
