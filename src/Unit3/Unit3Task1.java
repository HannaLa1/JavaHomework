package Unit3;

public class Unit3Task1 {
    public static void main (String args[]){

        int arr[] = new int [11];
        arr[0] = 2;

        for (int i = 0; i < 10; i++)
        {
            arr[i + 1] = arr[i] + 2;
        }

        System.out.println("Результирующий массив в строку--> ");

        for (int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n===================================");
        System.out.println("Результирующий массив в столбик--> ");

        for (int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
