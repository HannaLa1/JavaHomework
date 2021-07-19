package part3;
import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, index = 0, temp, imin = 0, imax = 0;

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
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");

            if (arr[i] > max)
            {
                max = arr[i];
                imax = i;
            }

            if (arr[i] < min)
            {
                min = arr[i];
                imin = i;
            }
        }

        System.out.println("\nМаксимальный элемент массива --> " + max);
        System.out.println("Минимальный элемент массива --> " + min);

        temp = arr[imin];
        arr[imin] = arr[imax];
        arr[imax] = temp;

        System.out.println("\nРезультирующий массив --> ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
