package ShopUnit13;
import java.io.IOException;

public class Producer implements Runnable{
    Shop shop;

    public Producer(Shop shop) throws IOException {
        this.shop = shop;
    }

    public void run(){
        for (int i = 1; i < 13; i++) {
            try {
                shop.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
