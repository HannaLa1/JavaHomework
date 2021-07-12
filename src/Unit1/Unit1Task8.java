package Unit1;

import java.util.Scanner;

public class Unit1Task8 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number --> ");
        int num1 = input.nextInt();
        System.out.println("Input the second number --> ");
        int num2 = input.nextInt();

        if (num1 > num2)
        {
            System.out.println("\nThe largest number --> " + num1);
        }
        else if (num1 < num2)
        {
            System.out.println("\nThe largest number --> " + num2);
        }
        else
        {
            System.out.println("Numbers are equal!");
        }
    }
}
