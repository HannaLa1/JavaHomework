package part2;

import java.util.Scanner;

public class ex3 {
    public static void main (String args[]) {

        int var = 0, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число --> ");
        int num = input.nextInt();

        temp = num;

        while (num != 0)
        {
            var = num % 10;
            num /= 10;
        }
        
        System.out.println("Сумма первой и последней цифр числа равна --> " + (temp % 10 + var));
    }
}
