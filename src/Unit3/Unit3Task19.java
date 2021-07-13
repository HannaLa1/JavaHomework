package Unit3;

import java.util.Scanner;

public class Unit3Task19 {
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

        int min = arr[0];
        for (int i = 0; i < size; i += 2)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("\nНаименьший элемент среди элементов с чётными индексами массива --> " + min);
    }
}
