package Unit3;

import java.util.Scanner;

public class Unit3Task11 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int mul = 1, count = 0;

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

            if (arr[i] % 3 == 0)
            {
                mul *= arr[i];
                count++;
            }
        }

        if (count == 0)
        {
            System.out.println("\nНет элементов, кратных 3 --> ");
        }

        System.out.println("\nПроизведение элементов, кратных 3 --> " + mul);
    }
}
