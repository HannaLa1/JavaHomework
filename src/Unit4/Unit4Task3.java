package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int size = 0, mul1 = 1, mul2 = 1;

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

        for (int i = 0; i < size; i++)
        {
            mul1 *= mas[i][i];
        }
        System.out.println("Произведение элементов главной диагонали --> " + mul1);

        for (int i = 0, j = size - 1; i < size; i++, j--)
        {
            mul2 *= mas[i][j];
        }
        System.out.println("Произведение элементов побочной диагонали --> " + mul2);

        if (mul1 > mul2)
        {
            System.out.println("\nПроизведение элементов главной больше побочной!");
        }
        else if (mul1 < mul2)
        {
            System.out.println("\nПроизведение элементов побочной больше главной!");
        }
        else
        {
            System.out.println("Произведения равны!");
        }
    }
}
