package ShopUnit12;

public class Product {
    private int id;
    private String name;
    private int price;
    private int order;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return  "Информация о товаре:" +
                "\nId --> " + id +
                "\nНазвание --> " + name +
                "\nЦена --> " + price +
                "\n-------------------------";
    }
}
