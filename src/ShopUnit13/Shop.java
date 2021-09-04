package ShopUnit13;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final String FILE_NAME_OUTPUT = "src/ShopUnit13/result.txt";

    public void addProduct(Product product) {

        boolean flag = products.stream()
                .noneMatch(item -> item.getId() == product.getId());

        if (flag) {
            parseFile(FILE_NAME_OUTPUT);
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
                .filter(p-> ((p.getPrice() >= from) && (p.getPrice() <= to)))
                .forEach(System.out::println);
    }

    public void filterByPriceWriteToFile(int from, int to){
        List<Product> list = products.stream()
                .filter(p-> ((p.getPrice() >= from) && (p.getPrice() <= to)))
                .collect(Collectors.toList());

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME_OUTPUT))) {
                list.forEach(s -> {
                    try {
                        bw.write(s + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
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

    public void writeProductToFile(String fileName) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            products.forEach(s -> {
                try {
                    bw.write(s + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void parseFile(String fileName) {
        try( BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null){
                String[] arr = str.split("\n");

                for (String s : arr){
                    getAllProducts().add(new Product(s));
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
