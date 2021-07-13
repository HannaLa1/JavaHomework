package Unit3;

public class Unit3Task5 {
    public static void main (String args[]){

        int arr1[] = new int [6];
        int arr2[] = new int [6];
        int sum1 = 0, sum2 = 0;
        double middle1, middle2;

        System.out.println("Первый массив --> ");

        for (int i = 0; i < 5; i++)
        {
            arr1[i] = (int)(Math.random() * 16);
            System.out.print(arr1[i] + " ");
            sum1 += arr1[i];
        }
        middle1 = (double) sum1 / 5;

        System.out.println("\n================");
        System.out.println("Второй массив --> ");

        for (int i = 0; i < 5; i++)
        {
            arr2[i] = (int)(Math.random() * 16);
            System.out.print(arr2[i] + " ");
            sum2 += arr2[i];
        }
        middle2 = (double) sum2 / 5;

        if (middle1 > middle2)
        {
            System.out.println("\nСреднее арифметическое элементов первого массива больше!");
            System.out.println( middle1 + " > " + middle2);
        }
        else if (middle1 < middle2)
        {
            System.out.println("\nСреднее арифметическое элементов второго массива больше!");
            System.out.println( middle2 + " > " + middle1);
        }
        else
        {
            System.out.println("\nСредние арифметические двух массивов равны!");
            System.out.println( middle1 + " = " + middle2);
        }
    }
}
