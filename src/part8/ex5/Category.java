package part8.ex5;
import java.util.Arrays;

public class Category {
    private String name;
    private Product[] arr;

    public Category(String name, Product[] arr) {
        this.name = name;
        this.arr = arr;
    }

    public String getName() {
        return name;
    }

    public Product[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        return  "\n-------------------------------------------------" +
                "\nИнформация о товаре -->" +
                "\nКатегория: " + name +
                Arrays.toString(arr);
    }
}
