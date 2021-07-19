package part3;

import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0;

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
            arr[i] = random.nextInt(16);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nВведите число шагов для сдвига --> ");
        int step =  input.nextInt();

        System.out.println("Сдвиг массива на две позиции влево --> ");
        for (int i = step; i < size; i++)
        {
            arr[i - step] = arr[i];
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < step; i++)
        {
            arr[size - i - 1] = 0;
        }

        System.out.println("\nРезультирующий массив --> ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
