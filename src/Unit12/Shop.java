package Unit12;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private final List<Item> products = new ArrayList<>();
    private int index = 0;
    private int indexId = 0;

    public void addProduct(Item product) {
        boolean flag = true;

        for (Item item : products) {
            if (item.getId() == product.getId()) {
                flag = false;
                break;
            }
        }

        if (flag) {
            products.add(product);
            product.setOrder(products.size() - 1);
        }
    }

    public List<Item> getAllProducts() {
        return products;
    }

    public void deleteProduct(int id) {
        System.out.println("\nDelete product with id = " + id + ":");

        for (Item item : products) {
            if (item.getId() == id){
                indexId = index;
            }
            index++;
        }
        products.remove(indexId);
    }

    public void sortPrice() {
        System.out.println("\nSorted by price -->");
        products.sort(Comparator.comparing(Item::getPrice));
    }

    public void sortPriceIncreasing() {
        System.out.println("\nSorted by price -->");
        products.sort(Comparator.comparing(Item::getPrice));
    }

    public void sortPriceDecreasing() {
        System.out.println("\nSorted by price -->");
        products.sort(Comparator.comparing(Item::getPrice).reversed());
    }

    public void sortByOrder() {
        System.out.println("Sort by order of addition(last added at the beginning) -->");
        products.sort(Comparator.comparing(Item::getOrder).reversed());
    }

    public void editProduct(Item product) {
        System.out.println("\nEdit one product -->");
        for (Item item : products) {
            if (item.getId() == product.getId()) {
                item.setName(product.getName());
                item.setPrice(product.getPrice());
            }
        }
    }
}
