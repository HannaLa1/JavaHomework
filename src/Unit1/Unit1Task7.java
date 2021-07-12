package Unit1;

import java.util.Scanner;

public class Unit1Task7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите кол-во программистов --> ");
        int prg = input.nextInt();

        if ((prg % 10 > 0 && prg % 10 < 9 && prg % 100 / 10 == 1) || prg % 10 == 0)
        {
            System.out.println("Результат --> " + prg + " программистов");
        }
        else if (prg % 10 == 2 || prg % 10 == 3 || prg % 10 == 4)
        {
            System.out.println("Результат --> " + prg + " программиста");
        }
        else if (prg % 10 == 1)
        {
            System.out.println("Результат --> " + prg + " программист");
        }
        else
        {
            System.out.println("Результат --> " + prg + " программистoв");
        }
    }
}
