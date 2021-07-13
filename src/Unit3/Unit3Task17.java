package Unit3;

import java.util.Scanner;

public class Unit3Task17 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int [size + 1];
        int count = 0;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
        }

        if (count == 0)
        {
            System.out.println("\nВсе элементы массива различны!");
        }
        else
        {
            System.out.println("\nЕсть похожие элементы в массиве!");
        }
    }
}
