package part3;

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0, sum = 0;

        System.out.println("Размер указанного массива --> ");

        do
        {
            if (input.hasNextInt())
            {
                size = input.nextInt();

                if (size <= 0)
                {
                    System.out.println("Введите размер ещё раз!");
                }
            }
            else
            {
                input.next();
                System.out.println("Введите положительное целое число!");
            }
        }while(size <= 0);

        int []arr = new int[size];

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = -10 + random.nextInt(21);
            System.out.print(arr[i] + " ");

            if ((arr[i]) > 0 && (arr[i] % 2 == 0))
            {
                sum += arr[i];
            }
        }

        System.out.println("\nСумма четных положительных элементов массива --> " + sum);
    }
}
