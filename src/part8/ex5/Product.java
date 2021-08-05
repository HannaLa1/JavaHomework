package part8.ex5;

public class Product {
    private String name;
    private double cost;
    private double rating;

    public Product(String name, double cost, double rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return  "\nНазвание: " + name +
                "\nЦена: " + cost +
                "\nРейтинг: " + rating;
    }
}
