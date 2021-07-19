package part3;
import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0, count = 0, max = 0, num = 0;

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

        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                {
                    num = arr[j];
                    count++;
                }
            }

            if (count > max)
            {
                max = count;
            }
        }

        if (count == 0)
        {
            System.out.println("\nВсе элементы массива различны!");
        }
        else
        {
            System.out.println("\nЧисло, чаще всего встречающееся в массиве --> " +  num);
        }
    }
}
