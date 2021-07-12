package Unit1;

public class Unit1Task1 {
    public static void main (String args[]) {
        int num, count = 0;
        int var = num = 12343434;

        while (var != 0)
        {
            count ++;
            var /= 10;
        }

        if (num > 0)
        {
            System.out.println("Это " + count +"-значное положительное число!");
        }
        else
        {
            System.out.println("Это " + count +"-значное отрицательное число!");
        }
    }
}