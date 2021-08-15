package part10;

public class Run {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product1 = new Product(124, "Cheese", 9);
        Product product2 = new Product(121, "Milk", 4);
        Product product3 = new Product(120, "Water", 2);
        Product product4 = new Product(124, "Fish", 2);
        Product product5 = new Product(133, "Meat", 15);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);

        System.out.println("Added products -->");
        for (Product value : shop.getAllProducts()) {
            if(value != null){
                System.out.println(value);
            }
        }

        shop.sortPrice();
        for (Product value : shop.getAllProducts()) {
            if(value != null){
                System.out.println(value);
            }
        }

        shop.deleteProduct(133);
        shop.sortByOrder();
        for (Product value : shop.getAllProducts()) {
            if(value != null){
                System.out.println(value);
            }
        }

        shop.editProduct(product1);
        for (Product value : shop.getAllProducts()) {
            if(value != null){
                System.out.println(value);
            }
        }
    }
}
