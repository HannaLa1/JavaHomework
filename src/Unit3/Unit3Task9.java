package Unit3;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int i = 0, sum = 0, sum1 = 0;

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int [size];

        System.out.println("Массив --> ");
        while (i != size / 2)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");
            sum += arr[i];
            i++;
        }

        for (int j = size / 2; j < size; j++)
        {
            arr[j] = (int)(Math.random() * 16);
            System.out.print(arr[j] + " ");

            sum1 += arr[j];
        }

        if (size % 2 == 0)
        {
            if (sum > sum1)
            {
                System.out.println("\nСумма левой половины массива больше!");
                System.out.println( sum + " > " + sum1);
            }
            else if (sum < sum1)
            {
                System.out.println("\nСумма правой половины массива больше!");
                System.out.println( sum1 + " > " + sum);
            }
            else
            {
                System.out.println("\nСуммы модулей половин массивов равны!");
                System.out.println( sum + " = " + sum1);
            }
        }
        else
        {
            System.out.println("\nВведён нечётный размер: size = " + size + "!");
        }
    }
}
