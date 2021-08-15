package part10;

import java.util.Arrays;

public class Shop {
    private final double LOAD = 0.5;
    private Product[] arr = new Product[10];
    private int index = 0;

    public void addProduct(Product product) {
        boolean flag = true;

        if (arr == null) {
            arr[index++] = product;
        }

        if (index >= arr.length * LOAD) {
            arr = Arrays.copyOf(arr, arr.length + 10);
        }

        for (int i = 0; i < index; i++) {
            if (arr[i].getId() == product.getId()) {
                flag = false;
            }
        }

        if (flag) {
            arr[index++] = product;
            product.setOrder(index);
        }
    }

    public Product[] getAllProducts() {
        return arr;
    }

    public void deleteProduct(int id) {
        System.out.println("\nDelete product with id = " + id + ":");
        System.out.println("Sort by order of addition(last added at the beginning) -->");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
                }
            }
        }
    }

    public void sortPrice() {
        System.out.println("\nSorted by price -->");
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != null){
                for (int j = 0; j < i; j++) {
                    if (arr[j].getPrice() > arr[j + 1].getPrice()) {
                        Product value = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = value;
                    }
                }
            }
        }
    }

    public void sortByOrder() {
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != null){
                for (int j = 0; j < i; j++) {
                    if (arr[j].getOrder() < arr[j + 1].getOrder()) {
                        Product value = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = value;
                    }
                }
            }
        }
    }

    public void editProduct(Product product){
        System.out.println("\nEdit one product -->");
        product.setId(100);
        product.setName("Pineapple");
        product.setPrice(13);
    }
}