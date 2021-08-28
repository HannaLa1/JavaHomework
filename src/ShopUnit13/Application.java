package ShopUnit13;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private final Shop shop = new Shop();
    private final Scanner input = new Scanner(System.in);

    public void start() throws IOException {
        int key;
        do {
            cleanConsole();
            mainMenu();

            key = expInputKey(0, 4);
            switch (key) {
                case 1 -> {
                    cleanConsole();
                    addProductSubmenu();

                    int key1 = expInputKey(0, 3);
                    switch (key1) {
                        case 1 -> {
                            cleanConsole();
                            shop.sortPriceIncreasing();
                            outputProducts();
                            input.nextLine();
                            pause();
                        }
                        case 2 -> {
                            cleanConsole();
                            shop.sortPriceDecreasing();
                            outputProducts();
                            input.nextLine();
                            pause();
                        }
                        case 3 -> {
                            cleanConsole();
                            shop.sortByOrder();
                            outputProducts();
                            input.nextLine();
                            pause();
                        }
                        case 0 -> {
                        }
                    }
                }
                case 2 -> {
                    cleanConsole();
                    shop.addProduct(inputData());
                    pause();
                }
                case 3 -> {
                    cleanConsole();
                    System.out.println("Введите id товара >>> ");
                    int id = expInput();
                    shop.deleteProduct(id);
                    pause();
                }
                case 4 -> {
                    cleanConsole();
                    System.out.println("Данные товара для редактирования:");
                    shop.editProduct(inputData());
                    pause();
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

        return new Product(id, name, price, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE), LocalTime.now());
    }

    public void cleanConsole(){
        repeat(30, () -> System.out.println());
    }

    public void outputProducts(){
        shop.getAllProducts().forEach(value -> System.out.println(value));
    }

    public void mainMenu(){
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
    }

    public void addProductSubmenu(){
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
    }

    public static void repeat(int n, Runnable r) {
        for (int i = 0; i < n; i++) {
            r.run();
        }
    }

    public void pause() throws IOException {
        System.out.println("Press ENTER to continue...");
        System.in.read();
    }
}
