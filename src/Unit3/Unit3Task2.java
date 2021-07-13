package Unit3;

public class Unit3Task2 {
    public static void main (String args[]){

        int arr[] = new int [51];
        arr[0] = 1;

        for (int i = 0; i < 50; i++)
        {
            arr[i + 1] = arr[i] + 2;
        }

        System.out.println("Результирующий массив --> ");

        for (int i = 0; i < 50; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n===========================================");
        System.out.println("Результирующий массив в обратном порядке --> ");

        for (int i = 49; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
