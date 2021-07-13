package Unit3;

public class Unit3Task8 {
    public static void main (String args[]){

        int arr1[] = new int [10];
        int arr2[] = new int [10];
        double arr3[] = new double [10];
        int count = 0;

        System.out.println("Массив 1-ый --> ");
        for (int i = 0; i < 10; i++)
        {
            arr1[i] = (int)(Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n==============");
        System.out.println("Массив 2-ой --> ");
        for (int i = 0; i < 10; i++)
        {
            arr2[i] = (int)(Math.random() * 10);
            System.out.print(arr2[i] + " ");

            if (arr2[i] == 0)
            {
                System.out.println("\nНельзя делить на ноль!");
                return;
            }
        }

        System.out.println("\n==============");
        System.out.println("Массив 3-ий --> ");
        for (int i = 0; i < 10; i++)
        {
            arr3[i] = 1. * arr1[i] / arr2[i];
            System.out.print(arr3[i] + " ");

            if (arr3[i] % 1 == 0)
            {
                count++;
            }
        }
        System.out.println("\nКоличество целых элементов в третьем массиве --> " + count);
    }
}
