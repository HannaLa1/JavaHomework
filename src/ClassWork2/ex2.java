package part2;

import java.util.Scanner;

public class ex2
{
    public static void main (String args[]) {

        int i = 1, fact = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число --> ");
        int num = input.nextInt();

        while (i <= num)
        {
            fact *= i;
            i++;
        }

        System.out.println("Факториал числа равен --> " + fact);
    }
}
