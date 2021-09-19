package ShopUnit13;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final LinkedList<Product> productListSell = new LinkedList<>();
    private final String FILE_NAME_IO = "ShopApplication/src/main/java/ShopUnit13/result.txt";
    private final String baseFile = "ShopApplication/src/main/java/ShopUnit13/jsonResult.json";
    private final String sellFile = "ShopApplication/src/main/java/ShopUnit13/sellProducts.txt";

    public void addProduct(Product product) {
        boolean flag = products.stream()
                .noneMatch(item -> item.getId() == product.getId());

        if (flag) {
            products.add(product);
        }
    }

    public void addProductForSell(Product product) {
        boolean flag = productListSell.stream()
                .noneMatch(item -> item.getId() == product.getId());

        if (flag) {
            productListSell.add(product);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void deleteProduct(int id) {
        products.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .ifPresentOrElse(i -> {
                            System.out.println("\n>>> Удалён продукт с id = " + id + "!");
                            products.remove(i);
                        },
                        () -> {
                            System.out.println("*Нет товара с таким id!*");
                        });
    }

    public void filterByPrice(int from, int to) {
        products.stream()
                .filter(p -> p.getPrice() >= from)
                .filter(p -> p.getPrice() <= to)
                .forEach(Product::printProduct);
    }

    public void filterByPriceWriteToFile(int from, int to) {
        List<Product> list = products.stream()
                .filter(p -> p.getPrice() >= from)
                .filter(p -> p.getPrice() <= to)
                .collect(Collectors.toList());

        writeProductToFileForFilter(FILE_NAME_IO, list);
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
        products.stream()
                .filter(item -> item.getId() == product.getId())
                .findFirst()
                .ifPresentOrElse(x -> {
                            x.setName(product.getName());
                            x.setPrice(product.getPrice());
                        },
                        () -> {
                            System.out.println("*Нет товара с таким id!*");
                        });
    }

    public void writeProductToFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            products.forEach(s -> {
                try {
                    bw.write(s + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void writeProductToFileForSell(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            productListSell.forEach(s -> {
                try {
                    bw.write(s + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void writeProductToFileForFilter(String fileName, List<Product> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            list.forEach(s -> {
                try {
                    bw.write(s + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void parseFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] arr = str.split("\n");

                Arrays.stream(arr)
                        .filter(s -> !s.equals(""))
                        .map(Product::new)
                        .forEach(products::add);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Product> productList = Arrays.asList(mapper.readValue(new File(baseFile), Product[].class));
        products.addAll(productList);
    }

    public synchronized void get() throws InterruptedException {
        while (productListSell.size() < 1){
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        productListSell.removeFirst();
        writeProductToFileForSell(sellFile);
        System.out.println(">>>Товар куплен!");
        notify();
        Thread.sleep(500);
    }

    public synchronized void put() throws InterruptedException {
        while (productListSell.size() >= 10){
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        addProductForSell(new Application().inputData());
        writeProductToFileForSell(sellFile);
        System.out.println(">>>Товар добавлен!");
        notify();
        Thread.sleep(500);
    }
}
