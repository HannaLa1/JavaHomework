package part8.ex5;

import java.util.Arrays;

public class Basket {
    private Product[] purchasedProducts;
    private Category category;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    @Override
    public String toString() {
        return  "\n-------------------------------------------------" +
                "\nИнформация о купленных товарах -->" +
                Arrays.toString(purchasedProducts);
    }
}
