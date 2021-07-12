package Unit1;

import java.util.Scanner;

public class Unit1Task2 {
    public static void main (String args[]) {
        Scanner input  = new Scanner(System.in);
        int a, b, c;

        System.out.println("Input the first side of triangle --> ");
        a = input.nextInt();
        System.out.println("Input the second side of triangle --> ");
        b = input.nextInt();
        System.out.println("Input the third side of triangle --> ");
        c = input.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b))
        {
            System.out.println("\nIt's a triangle!");
        }
        else
        {
            System.out.println("\nIt's not triangle!");
        }
    }
}
