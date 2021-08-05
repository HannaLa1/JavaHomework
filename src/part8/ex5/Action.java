package part8.ex5;

public class Action {
    public static void main(String[] args) {
        Product product1 = new Product("Наушники Sony", 109, 9.2);
        Product product2 = new Product("Iphone XS MAX", 3567, 10);
        Product product3 = new Product("Телевизор Samsung", 6789, 8.7);
        Product[] arr1 = {product1, product2, product3};

        Product product4 = new Product("Сыр", 7, 7.4);
        Product product5 = new Product("Суши", 48, 9.9);
        Product product6 = new Product("Пицца", 22, 8.9);
        Product[] arr2 = {product4, product5, product6};

        Category category1 = new Category("Техника", arr1);
        Category category2 = new Category("Продукты", arr2);
        Product[] arr3 = {product1, product2, product6};

        System.out.println(category1);
        System.out.println(category2);

        Basket basket = new Basket(arr3);
        User user = new User("annsdf2@mail.ru", "23221sdg", basket);
        System.out.println(user);
    }
}
