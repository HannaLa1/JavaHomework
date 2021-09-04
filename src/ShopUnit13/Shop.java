package ShopUnit13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Shop {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        boolean flag = products.stream()
                .noneMatch(item -> item.getId() == product.getId());

        if (flag) {
            products.add(product);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void deleteProduct(int id) {
        boolean flag = false;
        int indexId = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                indexId = i;
                flag = true;
            }
        }

        if (flag){
            System.out.println("\n>>> Удалён продукт с id = " + id + "!");
            products.remove(indexId);
        }else {
            System.out.println("*Нет товара с таким id!*");
        }
    }

    public void filterByPrice(int from, int to){
        products.stream()
                .filter(p-> ((p.getPrice() > from) && (p.getPrice() < to)))
                .forEach(System.out::println);
    }

    public void sortPriceDecreasing() {
        products.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    public void sortPriceIncreasing() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortByOrder() {
        products.sort(Comparator.comparing(Product::getLocalDate).thenComparing(Product::getLocalTime).reversed());
    }

    public void editProduct(Product product) {

        boolean flag = products.stream()
                .noneMatch(item -> item.getId() == product.getId());

        if (!flag) {
            products.stream()
                    .filter(x -> x.getId() == product.getId())
                    .forEach(p -> {
                        p.setName(product.getName());
                        p.setPrice(product.getPrice());
                    });
        } else {
            System.out.println("*Нет товара с таким id!*");
        }
    }
}
