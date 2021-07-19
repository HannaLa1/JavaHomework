package part3;

import java.util.Random;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0;
        boolean flag;

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

        System.out.println("Массив -->");
        for (int i = 0; i < size; i++)
        {
            arr[i] = random.nextInt(16);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nУникальные элементы массива -->");
        for (int i = 0; i < size; i++)
        {
            flag = true;
            for (int j = 0; j < size; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                  flag = false;
                  break;
                }
            }
            if (flag)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
