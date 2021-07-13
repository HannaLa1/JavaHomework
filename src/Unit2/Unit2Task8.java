package Unit2;

public class Unit2Task8 {
    public static void main (String args[]) {

        System.out.print("Первый треугольник -->");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4 - i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.print("Второй треугольник -->\n");

        for (int i = 4; i > 0; i--)
        {
            for (int j = 0; j < 4 - i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
