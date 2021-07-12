package Unit1;

import java.util.Scanner;

public class Unit1Task3 {
    public static void main (String args[]) {
        Scanner input  = new Scanner(System.in);
        int num;

        System.out.println("Input a number --> ");
        num = input.nextInt();

        if (num > 0)
        {
            num++;
        }
        else if (num < 0)
        {
            num = num - 2;
        }
        else
        {
            num = 10;
        }

        System.out.println("Result --> " + num);
    }
}

