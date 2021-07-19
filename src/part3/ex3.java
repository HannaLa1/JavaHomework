package part3;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Введите положительное число!");
            return;
        }

        int[] arr = new int[size];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");

            if (arr[i] > max)
            {
                max = arr[i];
            }

            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("\nМаксимальный элемент массива --> " + max);
        System.out.println("\nМинимальный элемент массива --> " + min);
    }
}
