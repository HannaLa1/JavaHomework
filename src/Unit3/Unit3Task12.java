package Unit3;
import java.util.Scanner;

public class Unit3Task12 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int sum = 0;
        double middle;

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

            if (i % 2 != 0)
            {
                sum += arr[i];
            }
        }
        middle = (double) sum / (size / 2);

        System.out.println("\nСреднее арифметическое элементов с нечетными номерами --> " + middle);
    }
}
