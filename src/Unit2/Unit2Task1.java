package Unit2;

public class Unit2Task1 {
    public static void main (String args[]) {
        double sumWay = 0;

        for (int i = 0; i < 7; i++)
        {
            sumWay += 10 * Math.pow(1.1,i);
        }

        System.out.println("Суммарный путь, который пробежит спортсмен --> " + sumWay);
    }
}
