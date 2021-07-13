package Unit2;

public class Unit2Task0 {
    public static void main (String args[]) {
        int i = 0;

        System.out.println("Вывод чисел с помощью цикла while --> ");
        while (i < 11)
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n======================================");

        System.out.println("Вывод чисел с помощью цикла for --> ");
        for (i = 0; i <= 10; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n======================================");

        System.out.println("Вывод чисел с помощью цикла do while --> ");
        i = 0;

        do
        {
            System.out.print(i + " ");
            i++;
        } while (i < 11);
    }
}
