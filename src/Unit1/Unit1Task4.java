package Unit1;

import java.util.Scanner;

public class Unit1Task4 {
    public static void main (String args[]){
        int num1, num2, num3, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number --> ");
        num1 = input.nextInt();
        System.out.println("Input the second number --> ");
        num2 = input.nextInt();
        System.out.println("Input the third number --> ");
        num3 = input.nextInt();

        if (num1 > 0)
        {
            count++;
        }
        if (num2 > 0)
        {
            count++;
        }
        if (num3 > 0)
        {
            count++;
        }

        System.out.println("Count of positive numbers --> " + count);
    }
}
