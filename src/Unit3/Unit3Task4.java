package Unit3;

public class Unit3Task4 {
    public static void main (String args[]){

        int arr[] = new int [21];

        System.out.println("Начальный массив --> ");

        for (int i = 0; i < 20; i++)
        {
            arr[i] = (int)(Math.random() * 21);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n========================");
        System.out.println("Результирующий массив --> ");

        for (int i = 0; i < 20; i++)
        {
            if (i % 2 != 0)
            {
                arr[i] = 0;
            }

            System.out.print(arr[i] + " ");
        }
    }
}
