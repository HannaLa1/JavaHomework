package Unit3;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Размер указанного массива --> ");
        int n = input.nextInt();

        if (n <= 3)
        {
            System.out.println("Нужно ввести число большее 3!");
            return;
        }

        int arr[] = new int [n];
        int res[] = new int [n];

        System.out.println("Массив --> ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = (int)(Math.random() * (n + 1));
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nРезультирующий массив --> ");
        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0)
            {
                res[i] = arr[i];
                System.out.print(res[i] + " ");
                count++;
            }
        }

        if (count == 0)
        {
            System.out.println("\nВ результирующем массиве нет чётных элементов --> ");
        }
    }
}
