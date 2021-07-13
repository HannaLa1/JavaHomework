package Unit3;

public class Unit3Task7 {
    public static void main (String args[]){

        int arr[] = new int [12];
        int max = arr[0], index = 0;

        System.out.println("Массив --> ");

        for (int i = 0; i < 12; i++)
        {
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + " ");

            if (arr[i] >= max)
            {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальный элемент в этом массиве --> " + max);
        System.out.println("Индекс его последнего вхождения в массив --> " + index);
    }
}
