package Unit2;

public class Unit2Task3 {
    public static void main (String args[]) {
        int i = 0, sum = 0;

        while(i <= 8)
        {
            sum += Math.pow(2, i);
            i++;
        }

        System.out.println("Сумма равна --> " + sum);
    }
}
