package Unit2;
import java.util.Scanner;

public class Unit2Task4 {
    public static void main (String args[]) {
        int i = 0, mul = 0, temp1, temp2;

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number --> ");
        int num1 = input.nextInt();
        System.out.println("Input the second number --> ");
        int num2 = input.nextInt();

        temp1 = num1;
        temp2 = num2;

        if (num2 < 0)
        {
            num2 *= -1;
        }
        else if (num1 < 0)
        {
            num1 *= -1;
        }

        for (i = 0; i < num2; i++)
        {
           mul += num1;
        }

        if ((temp1 < 0) || (temp2 < 0))
        {
            System.out.println("\nA * B = " + (-1) * mul);
        }
        else
        {
            System.out.println("A * B = " + mul);
        }
    }
}
