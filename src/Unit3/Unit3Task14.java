package Unit3;
import java.util.Scanner;

public class Unit3Task14 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int [size];
        int min = 0;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");

            if (arr[i] % 2 != 0)
            {
                if (min == 0)
                {
                    min = arr[i];
                }
                else if (arr[i] < min)
                {
                    min = arr[i];
                }
            }
        }

        if (min == 0)
        {
            System.out.println("\nНечетных элементов нет --> ");
        }
        else
        {
            System.out.println("\nНаименьший нечетный элемент --> " + min);
        }
    }
}
