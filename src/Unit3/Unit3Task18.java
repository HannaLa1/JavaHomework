package Unit3;
import java.util.Scanner;

public class Unit3Task18 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Размер указанного массива --> ");
        int size = input.nextInt();
        System.out.println("Введите произвольное число от 0 до 15 --> ");
        int num = input.nextInt();

        if (size <= 0)
        {
            System.out.println("Введите положительное число!");
            return;
        }

        int arr[] = new int [size + 1];
        int count = 0;

        System.out.println("Массив --> ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");

            if (arr[i] == num)
            {
                count++;
            }
        }

        if (count != 0)
        {
            System.out.println("\nДанный элемент встречается (кол-во раз): " + count);
        }
        else
        {
            System.out.println("\nДанного элемента нет в массиве!");
        }
    }
}
