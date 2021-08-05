package part8.ex3;

public enum TypeOfAnimal {
    DOG("Собака"),
    CAT("Кот"),
    HORSE("Лошадь");

    private final String type;

    TypeOfAnimal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
