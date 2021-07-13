package Unit2;

public class Unit2Task7 {
    public static void main (String args[]) {
        int i = 1, sum = 0;

        System.out.println("Сумма всех нечетных чисел от 1 до 99 -->");

        while(i < 100)
        {
            sum += i;
            i = i + 2;
        }
        System.out.print(sum);
    }
}
