package part1;

public class ex6 {
    public static void main (String args[]) {
        int s = 0, i = 0;

        while (i <= 9)
        {
            s = (int)Math.pow(2, i);
            System.out.print(s + " ");
            i++;
        }
    }
}
