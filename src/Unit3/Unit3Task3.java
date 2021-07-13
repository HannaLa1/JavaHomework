package Unit3;

public class Unit3Task3 {
    public static void main (String args[]){

        int arr[] = new int [16], count = 0;

        for (int i = 0; i < 15; i++)
        {
            arr[i] = 1 + (int)(Math.random() * 99);

            if (arr[i] % 2 == 0)
            {
                count++;
            }
        }

        System.out.println("Результирующий массив --> ");

        for (int i = 0; i < 15; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nКоличество чётных элементов массива --> " + count);
    }
}
