package Unit5;

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {

        Computer device = new Computer("DESKTOP-M01BM6M", "Intel Core i5",
                "DDR4 8ГБ", "SATA до 2Тб", 6);
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int num;

        System.out.println(device);

        while(flag)
        {
            System.out.println("Input your choice:");
            System.out.println("[1] Turn on -->");
            System.out.println("[2] Turn off -->");
            do{
                num = in.nextInt();
            }while (num < 1 || num > 2);

            switch (num)
            {
                case 1 -> {
                    flag = device.on();
                }
                case 2 -> {
                    flag = device.off();
                }
            }
        }
    }
}
