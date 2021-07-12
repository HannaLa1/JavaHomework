package Unit1;

import java.util.Scanner;

public class Unit1Task5 {
    public static void main (String args[]){
        int num1, num2, num3, countP = 0, countN= 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number --> ");
        num1 = input.nextInt();
        System.out.println("Input the second number --> ");
        num2 = input.nextInt();
        System.out.println("Input the third number --> ");
        num3 = input.nextInt();

        if (num1 > 0)
        {
            countP++;
        }
        else if (num1 < 0)
        {
            countN++;
        }

        if (num2 > 0)
        {
            countP++;
        }
        else if (num2 < 0)
        {
            countN++;
        }

        if (num3 > 0)
        {
            countP++;
        }
        else if (num3 < 0)
        {
            countN++;
        }

        System.out.println("\nCount of positive numbers --> " + countP);
        System.out.println("Count of negative numbers --> " + countN);
    }
}
