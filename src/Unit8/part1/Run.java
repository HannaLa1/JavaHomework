package Unit8.part1;

import Unit8.part1.footwear.AdidasFootwear;
import Unit8.part1.footwear.Footwear;
import Unit8.part1.footwear.NikeFootwear;
import Unit8.part1.jacket.Jacket;
import Unit8.part1.jacket.LevisJacket;
import Unit8.part1.jacket.ZaraJacket;
import Unit8.part1.trousers.CalvinKleinTrousers;
import Unit8.part1.trousers.GuessTrousers;
import Unit8.part1.trousers.Trousers;

public class Run {
    public static void main(String[] args) {
        Jacket jacket1 = new LevisJacket();
        Jacket jacket2 = new ZaraJacket();
        Trousers trousers1 = new CalvinKleinTrousers();
        Trousers trousers2 = new GuessTrousers();
        Footwear footwear1 = new NikeFootwear();
        Footwear footwear2 = new AdidasFootwear();
        IHuman human1 = new Human("Георгий", jacket1, trousers2, footwear2);
        IHuman human2 = new Human("Юрий", jacket2, trousers1, footwear1);

        human1.putOn();
        human1.takeOff();
        human2.putOn();
        human2.takeOff();
    }
}
