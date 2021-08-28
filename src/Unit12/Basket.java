package Unit12;

public class Basket {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Item product1 = new Item(124, "Cheese", 9);
        Item product2 = new Item(121, "Milk", 4);
        Item product3 = new Item(120, "Water", 2);
        Item product4 = new Item(124, "Fish", 2);
        Item product5 = new Item(133, "Meat", 15);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);

        System.out.println("Added products -->");
        for (Item value : shop.getAllProducts()) {
            System.out.println(value);
        }

        shop.sortPrice();
        for (Item value : shop.getAllProducts()) {
            System.out.println(value);
        }

        shop.deleteProduct(133);
        shop.sortByOrder();
        for (Item value : shop.getAllProducts()) {
            System.out.println(value);
        }

        shop.editProduct(product4);
        for (Item value : shop.getAllProducts()) {
            System.out.println(value);
        }
    }
}
