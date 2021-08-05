package Unit8.part1;

import Unit8.part1.footwear.Footwear;
import Unit8.part1.jacket.Jacket;
import Unit8.part1.trousers.Trousers;

public class Human implements IHuman{
    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Footwear footwear;

    public Human(String name, Jacket jacket, Trousers trousers, Footwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    public Human(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public Footwear getFootwear() {
        return footwear;
    }

    public void setFootwear(Footwear footwear) {
        this.footwear = footwear;
    }

    @Override
    public void putOn() {
        System.out.println("Имя человека --> " + name);
        jacket.putOn();
        trousers.putOn();
        footwear.putOn();
        System.out.println();
    }

    @Override
    public void takeOff() {
        System.out.println("Имя человека --> " + name);
        jacket.takeOff();
        trousers.takeOff();
        footwear.takeOff();
        System.out.println("-------------------------");
    }
}
