package part3;

import java.util.Scanner;

public class ex1 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr1[] = new int [size];
        int count = 0;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr1[i] = (int)(Math.random() * 16);
            System.out.print(arr1[i] + " ");

            if (arr1[i] % 2 == 0)
            {
               count++;
            }
        }

        if (count == 0)
        {
            System.out.println("Нет четных элементов!");
            return;
        }

        int arr2[] = new int [count];

        System.out.println("\n========================");
        System.out.println("Результирующий массив --> ");
        for (int i = 0; i < size; i++)
        {
            if (arr1[i] % 2 == 0)
            {
                arr2[i] = i;
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
