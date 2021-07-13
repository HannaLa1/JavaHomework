package Unit3;
import java.util.Scanner;

public class Unit3Task16 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int [size];

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n========================");
        System.out.println("Результирующий массив --> ");
        for (int i = 0; i < size; i++)
        {
            if (i % 2 != 0)
            {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
