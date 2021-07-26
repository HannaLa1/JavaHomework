package part3;
import java.util.Scanner;

public class ex2 {
    public static void main (String args[]) {

//        Random random = new Random();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Размер --> ");
//        int N = input.nextInt();
//        int arr[] = new int [N];
//
//        System.out.println("Массив --> ");
//        for (int i = 0; i < N; i++)
//        {
//            arr[i] = random.nextInt(51);
//            System.out.print(arr[i] + " ");
//        }



        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int[] arr = new int [size];
        int count = 0, sum = 0;
        double middle;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");

            if (arr[i] > 0)
            {
                sum += arr[i];
                count++;
            }
        }

        if (count == 0)
        {
            System.out.println("Нет четных элементов!");
        }

        System.out.println("\nСреднее арифметическое положительных элементов массива --> " + ((double)sum / count));
    }
}
