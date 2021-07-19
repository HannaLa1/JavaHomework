package part3;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
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
        int max = Integer.MIN_VALUE, index = 0;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = -10 + random.nextInt(21);
            System.out.print(arr[i] + " ");

            if (arr[i] > max && arr[i] < 0)
            {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальный отрицательный элемент массива --> " + max);
        System.out.println("Его позиция в массиве --> " + index);
    }
}
