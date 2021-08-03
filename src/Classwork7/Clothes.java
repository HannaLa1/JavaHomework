package part7.ex2;

public abstract class Clothes {
    private int sizeOfClothes;
    private String size;
    private int cost;
    private String color;
    private String type;

    Clothes ()
    {
        this.sizeOfClothes = 0;
        this.size = null;
        this.cost = 0;
        this.color = null;
        this.type = null;
    }

    Clothes (int sizeOfClothes, String size, int cost, String color, String type)
    {
        this.sizeOfClothes = sizeOfClothes;
        this.size = size;
        this.cost = cost;
        this.color = color;
        this.type = type;
    }

    public int getSizeOfClothes() {
        return sizeOfClothes;
    }

    public String getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public String getType() { return type; }
}
