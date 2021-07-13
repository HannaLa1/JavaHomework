package Unit2;

public class Unit2Task2 {
    public static void main (String args[]) {
        int i = 3, kl = 1;

       while(i <= 24)
        {
            kl = kl * 2;
            System.out.println("Кол-во амёб через " + i + " ч. --> " + kl);
            i = i + 3;
        }
    }
}

