package part2;
import java.util.Scanner;

public class ex1 {
    public static void main (String args[]) {

        int i = 0, countP = 0, countN = 0, var;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число --> ");
        int num = input.nextInt();

        while (num != 0)
        {
            var = num % 10;

            if (var % 2 == 0)
                countP++;
            else
                countN++;

            num /= 10;
        }

        System.out.println("Количество чётных цифр --> " + countP);
        System.out.println("Количество нечётных цифр --> " + countN);
    }
}
