package ShopUnit13;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private final Shop shop = new Shop();
    private Scanner input = new Scanner(System.in);
    private String FILE_NAME_OUTPUT = "src/ShopUnit13/result.txt";

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

                    int key1 = expInputKey(0, 4);
                    switch (key1) {
                        case 1 -> {
                            cleanConsole();
                            shop.sortPriceIncreasing();
                            typeOfDataOutput();
                            pause();
                        }
                        case 2 -> {
                            cleanConsole();
                            shop.sortPriceDecreasing();
                            typeOfDataOutput();
                            pause();
                        }
                        case 3 -> {
                            cleanConsole();
                            shop.sortByOrder();
                            typeOfDataOutput();
                            pause();
                        }
                        case 4 -> {
                            cleanConsole();
                            inputFilter();
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

    public int expInputKey(int from, int to) {
        int value = 0;
        boolean flag;

        do
        {
            flag=true;
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
                flag=false;
                input.next();
                System.out.println("Введите положительное целое число!");
            }
        }while(!flag || value < from || value > to);

        return value;
    }

    public int expInput(){
        int value = 0;
        boolean flag;

        do
        {
            flag = true;
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
                flag = false;
                input.next();
                System.out.println("Введите положительное целое число!");
            }
        }while(!flag || value <= 0);

        return value;
    }

    public String expInputString(){
        String str;
        boolean flag = false;

        do
        {
            str = input.next();
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

    public void inputFilter(){
        System.out.println("\n--------------------------------------------");
        System.out.println("Вывести информацию в консоль / в файл (1/0)?");
        System.out.println("--------------------------------------------");

        int key2 = expInputKey(0, 1);
        cleanConsole();
        switch (key2){
            case 0 ->{
                System.out.println(">>>Введите диапазон цен -->\n");
                System.out.println("*Введите нижнюю границу: ");
                int limit1 = expInput();
                System.out.println("*Введите верхнюю границу: ");
                int limit2 = expInput();
                shop.filterByPriceWriteToFile(limit1, limit2);
            }
            case 1 -> {
                System.out.println(">>>Введите диапазон цен -->\n");
                System.out.println("*Введите нижнюю границу: ");
                int limit1 = expInput();
                System.out.println("*Введите верхнюю границу: ");
                int limit2 = expInput();
                shop.filterByPrice(limit1, limit2);
            }
        }
    }

    public Product inputData(){
        System.out.println("Введите id товара >>> ");
        int id = expInput();
        System.out.println("Введите название товара >>> ");
        String name = expInputString();
        System.out.println("Введите цену товара >>> ");
        int price = expInput();

        return new Product(id, name, price, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE), LocalTime.now());
    }

    public void cleanConsole(){
        repeat(30, System.out::println);
    }

    public void outputProducts(){
        shop.getAllProducts().forEach(s -> s.printProduct());
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
        System.out.println("\t\t\t\t\t\t|4 >>> фильтр по цене                                  |");
        System.out.println("\t\t\t\t\t\t|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t\t\t\t\t\t|                                                      |");
        System.out.println("\t\t\t\t\t\t|0 >>> *Назад*                                         |");
        System.out.println("\t\t\t\t\t\t|                                                      |");
        System.out.println("\t\t\t\t\t\t|         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  |");
        System.out.println("\t\t\t\t\t\t|         :Выберите соответствующий параметр.. <0-4>:  |");
        System.out.println("\t\t\t\t\t\t|         :                                         :  |");
        System.out.println("\t\t\t\t\t\t|_________:                                         :__|");
        System.out.println("\t\t\t\t\t\t.............>>> ");
    }

    public void typeOfDataOutput(){
        System.out.println("\n--------------------------------------------");
        System.out.println("Вывести информацию в консоль / в файл (1/0)?");
        System.out.println("--------------------------------------------");

        int key2 = expInputKey(0, 1);
        cleanConsole();
        switch (key2){
            case 0 -> shop.writeProductToFile(FILE_NAME_OUTPUT);
            case 1 -> outputProducts();
        }
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
