package ShopUnit12;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    private final Shop shop = new Shop();
    private final Scanner input = new Scanner(System.in);

    public void start() throws IOException {
        int key = 0;
        do {
            for (int i = 0; i < 30; i++){
                System.out.println();
            }
            System.out.println("\n\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("\t\t\t\t\t\t|_____________________М А Г А З И Н____________________|");
            System.out.println("\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("\t\t\t\t\t\t________________________________________________________");
            System.out.println("\t\t\t\t\t\t|>>>>>>>>>>>>>>>>>>>|КОРЗИНА ТОВАРОВ|<<<<<<<<<<<<<<<<<<|");
            System.out.println("\t\t\t\t\t\t|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");

            System.out.println("\t\t\t\t\t\t|====================|Главное меню|====================|");
            System.out.println("\t\t\t\t\t\t|______________________________________________________|");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|1 >>> Вывод всех товаров                              |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|2 >>> Добавление товара                               |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|3 >>> Удаление товара                                 |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|4 >>> Редактирование товара                           |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|0 >>> Выход                                           |");
            System.out.println("\t\t\t\t\t\t|                                                      |");
            System.out.println("\t\t\t\t\t\t|                   _____________________________      |");
            System.out.println("\t\t\t\t\t\t|                   |Выберите действие...  <0-4>|      |");
            System.out.println("\t\t\t\t\t\t|                   |                           |      |");
            System.out.println("\t\t\t\t\t\t|___________________|                           |______|");
            System.out.println("\t\t\t\t\t\t.....................>>> ");


            key = expInputKey(0, 4);
            switch (key) {
                case 1 -> {
                    for (int i = 0; i < 30; i++) {
                        System.out.println();
                    }
                    System.out.println("\n\n\t\t\t\t\t\t             ||||||||||||||||||||||||||||||||           ");
                    System.out.println("\t\t\t\t\t\t                    Сортировка товаров                  ");
                    System.out.println("\t\t\t\t\t\t             ||||||||||||||||||||||||||||||||           ");
                    System.out.println("\t\t\t\t\t\t________________________________________________________");
                    System.out.println("\t\t\t\t\t\t|                                                      |");
                    System.out.println("\t\t\t\t\t\t|1 >>> по цене(возрастание)                            |");
                    System.out.println("\t\t\t\t\t\t|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    System.out.println("\t\t\t\t\t\t|                                                      |");
                    System.out.println("\t\t\t\t\t\t|2 >>> по цене(убывание)                               |");
                    System.out.println("\t\t\t\t\t\t|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    System.out.println("\t\t\t\t\t\t|                                                      |");
                    System.out.println("\t\t\t\t\t\t|3 >>> по добавлению(сначала новые, потом более старые)|");
                    System.out.println("\t\t\t\t\t\t|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    System.out.println("\t\t\t\t\t\t|                                                      |");
                    System.out.println("\t\t\t\t\t\t|0 >>> *Назад*                                         |");
                    System.out.println("\t\t\t\t\t\t|                                                      |");
                    System.out.println("\t\t\t\t\t\t|         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  |");
                    System.out.println("\t\t\t\t\t\t|         :Выберите соответствующий параметр.. <0-3>:  |");
                    System.out.println("\t\t\t\t\t\t|         :                                         :  |");
                    System.out.println("\t\t\t\t\t\t|_________:                                         :__|");
                    System.out.println("\t\t\t\t\t\t.............>>> ");

                    int key1 = expInputKey(0, 3);
                    switch (key1) {
                        case 1 -> {
                            for (int i = 0; i < 30; i++) {
                                System.out.println();
                            }
                            shop.sortPriceIncreasing();
                            for (Product value : shop.getAllProducts()) {
                                System.out.println(value);
                            }
                            input.nextLine();
                            System.out.println("Press ENTER to continue...");
                            System.in.read();
                        }
                        case 2 -> {
                            for (int i = 0; i < 30; i++) {
                                System.out.println();
                            }
                            shop.sortPriceDecreasing();
                            for (Product value : shop.getAllProducts()) {
                                System.out.println(value);
                            }
                            input.nextLine();
                            System.out.println("Press ENTER to continue...");
                            System.in.read();
                        }
                        case 3 -> {
                            for (int i = 0; i < 30; i++) {
                                System.out.println();
                            }
                            shop.sortByOrder();
                            for (Product value : shop.getAllProducts()) {
                                System.out.println(value);
                            }
                            input.nextLine();
                            System.out.println("Press ENTER to continue...");
                            System.in.read();
                        }
                        case 0 -> {
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; i < 30; i++) {
                        System.out.println();
                    }

                    shop.addProduct(inputData());
                    System.out.println("Press ENTER to continue...");
                    System.in.read();
                }
                case 3 -> {
                    for (int i = 0; i < 30; i++) {
                        System.out.println();
                    }

                    System.out.println("Введите id товара >>> ");
                    int id = expInput();
                    shop.deleteProduct(id);
                    System.out.println("Press ENTER to continue...");
                    System.in.read();
                }
                case 4 -> {
                    for (int i = 0; i < 30; i++) {
                        System.out.println();
                    }

                    System.out.println("Данные товара для редактирования:");
                    shop.editProduct(inputData());
                    System.out.println("Press ENTER to continue...");
                    System.in.read();
                }
                case 0 -> {
                }
            }

        }while (key != 0);
    }

    public int expInputKey(int from, int to){
        int value = 0;

        do
        {
            if (input.hasNextInt())
            {
                value = input.nextInt();

                if (value < from || value > to)
                {
                    System.out.println("Выберите действие повторно!");
                }
            }
            else
            {
                input.next();
                System.out.println("Введите положительное целое число!");
            }
        }while(value < from || value > to);

        return value;
    }

    public int expInput(){
        int value = 0;

        do
        {
            if (input.hasNextInt())
            {
                value = input.nextInt();

                if (value <= 0)
                {
                    System.out.println("Введите размер ещё раз!");
                }
            }
            else
            {
                input.next();
                System.out.println("Введите положительное целое число!");
            }
        }while(value <= 0);

        return value;
    }

    public String expInputString(){
        String str;
        boolean flag = false;

        do
        {
            str = input.nextLine();
            char[] chars = str.toCharArray();

            for (char aChar : chars) {
                if ((aChar >= 'a' && aChar <= 'z' || aChar >= 'A' && aChar <= 'Z') ||
                        (aChar >= 'а' && aChar <= 'я' || aChar >= 'А' && aChar <= 'Я')) {
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }

            if (!flag){
            System.out.println("Введите название, состоящие из букв!");
        }
        }while(!flag);

        return str;
    }

    public Product inputData(){
        System.out.println("Введите id товара >>> ");
        int id = expInput();
        input.nextLine();
        System.out.println("Введите название товара >>> ");
        String name = expInputString();
        System.out.println("Введите цену товара >>> ");
        int price = expInput();

        return new Product(id, name, price);
    }
}
