package Unit3;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размерность массива --> ");
        int size = input.nextInt();
        int arr[] = new int [size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = i * 4;
        }

        System.out.println("Результирующий массив --> ");

        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
