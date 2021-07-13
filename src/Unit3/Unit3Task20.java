package Unit3;

import java.util.Scanner;

public class Unit3Task20 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int[size];
        int index = 0, ind = 0, temp;

        System.out.println("Массив --> ");

        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < size; i++)
        {
            if (arr[i] >= max)
            {
                max = arr[i];
                ind = i;
            }
        }

        for (int i = 0; i < size; i++)
        {
            if (arr[i] == 0)
            {
                index = i;
            }
        }

        System.out.println("\nМаксимальный элемент в массиве --> " + max);

        temp = arr[ind];
        arr[ind] = arr[index];
        arr[index] = temp;

        System.out.println("\n=========================================");
        System.out.println("Результирующий массив --> ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
