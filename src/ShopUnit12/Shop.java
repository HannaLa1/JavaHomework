package ShopUnit12;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        boolean flag = true;

        for (Product item : products) {
            if (item.getId() == product.getId()) {
                flag = false;
                break;
            }
        }

        if (flag) {
            product.setOrder(products.size());
            products.add(product);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void deleteProduct(int id) {
        boolean flag = false;
        int index = 0;
        int indexId = 0;

        for (Product item : products) {
            if (item.getId() == id) {
                indexId = index;
                flag = true;
            }
            index++;
        }

        if (flag){
            System.out.println("\nУдалён продукт с id = " + id + "!");
            products.remove(indexId);
        }else {
            System.out.println("Нет товара с таким id!");
        }
    }

    public void sortPriceDecreasing() {
        products.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    public void sortPriceIncreasing() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortByOrder() {
        products.sort(Comparator.comparing(Product::getOrder).reversed());
    }

    public void editProduct(Product product) {
        boolean flag = false;

        for (Product item : products) {
            if (item.getId() == product.getId()) {
                item.setName(product.getName());
                item.setPrice(product.getPrice());
                flag = true;
            }
        }

        if (!flag){
            System.out.println("Нет товара с таким id!");
        }
    }
}
