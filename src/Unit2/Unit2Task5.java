package Unit2;

public class Unit2Task5 {
    public static void main (String args[]) {

        double s;

        System.out.println("====================================================");
        System.out.println("Таблица перевода расстояний из дюймов в сантиметры: ");
        System.out.println("====================================================");

        for (int i = 1; i <= 20; i++)
        {
            s = 2.54 * i;
            System.out.println("Кол-во дюймов: " + i + " в см --> " + s);
        }

    }
}
