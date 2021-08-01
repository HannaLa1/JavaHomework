package Unit7;

import Unit7.hands.IHand;
import Unit7.hands.SamsungHand;
import Unit7.hands.SonyHand;
import Unit7.hands.ToshibaHand;
import Unit7.heads.IHead;
import Unit7.heads.SamsungHead;
import Unit7.heads.SonyHead;
import Unit7.heads.ToshibaHead;
import Unit7.legs.ILeg;
import Unit7.legs.SamsungLeg;
import Unit7.legs.SonyLeg;
import Unit7.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        int price1, price2, price3;
        IHead head1 = new SamsungHead(231);
        IHand hand1 = new SonyHand(533);
        ILeg leg1 = new SonyLeg(311);

        IHead head2 = new ToshibaHead(343);
        IHand hand2 = new SamsungHand(333);
        ILeg leg2 = new ToshibaLeg(224);

        IHead head3 = new SonyHead(322);
        IHand hand3 = new ToshibaHand(199);
        ILeg leg3 = new SamsungLeg(343);

        IRobot robot1 = new Robot(head1, hand1, leg1);
        robot1.action();
        price1 = robot1.getPrice();
        System.out.println("Цена 1-ого робота: " + price1 + "\n");

        IRobot robot2 = new Robot(head2, hand2, leg2);
        robot2.action();
        price2 = robot2.getPrice();
        System.out.println("Цена 2-ого робота: " + price2 + "\n");

        IRobot robot3 = new Robot(head3, hand3, leg3);
        robot3.action();
        price3 = robot3.getPrice();
        System.out.println("Цена 3-ого робота: " + price3 + "\n");

        if (price1 > price2) {
            if (price1 > price3) {
                System.out.println("Самый дорогой робот 1 (цена --> " + price1 + ")");
            }
            else{
                System.out.println("Самый дорогой робот 3 (цена --> " + price3 + ")");
            }
        }
        else{
            if (price2 > price3) {
                System.out.println("Самый дорогой робот 2 (цена --> " + price2 + ")");
            }
            else{
                System.out.println("Самый дорогой робот 3 (цена --> " + price3 + ")");
            }
        }
    }
}
