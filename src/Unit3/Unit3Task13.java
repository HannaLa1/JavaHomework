package Unit3;
import java.util.Scanner;

public class Unit3Task13 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        double middle;

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();
        System.out.println("Введите произвольное число от 0 до 15 --> ");
        int num = input.nextInt();

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

            if (arr[i] > num)
            {
                sum += arr[i];
                count++;
            }
        }
        middle = 1. * sum / count;

        System.out.println("\nСреднее арифметическое элементов массива, превосходящих некоторое число --> " + middle);
    }
}
