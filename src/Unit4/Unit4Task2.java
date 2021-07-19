package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0;
        boolean flag = true;

        System.out.println("Размер квадратной матрицы --> ");

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

        int [][]mas = new int[size][size];

        System.out.println("Матрица --> ");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                mas[i][j] = random.nextInt(51);
                System.out.print(" " + mas[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Нечётные элементы находящиеся под главной диагональю --> ");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (mas[i][j] % 2 != 0)
                {
                    flag = true;
                    System.out.print(mas[i][j] + " ");
                }
            }
        }

        if (!flag)
        {
            System.out.println("Нет нечётных элементов");
        }
    }
}
