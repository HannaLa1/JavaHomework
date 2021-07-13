package part1;
import java.util.Scanner;

public class ex4 {
    public static void main (String args[]) {
        int s = 0, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Input number --> ");
        int num = input.nextInt();

        while (i <= num)
        {
            s += i;
            i++;
        }

        System.out.println("Сумма равна --> " + s);
    }
}
