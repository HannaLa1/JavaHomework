package ShopUnit13;
import java.time.LocalDate;
import java.time.LocalTime;

public class Product {
    private int id;
    private String name;
    private int price;
    private String localDate;
    private LocalTime localTime;

    public Product(int id, String name, int price, String localDate, LocalTime localTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.localDate = localDate;
        this.localTime = localTime;
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


    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return  "Информация о товаре:" +
                "\n>>> Id --> " + id +
                "\n>>> Название --> " + name +
                "\n>>> Цена --> " + price +
                "\n>>> Дата добавления --> " + localDate + " | " + localTime +
                "\n---------------------------------------------------------";
    }
}
