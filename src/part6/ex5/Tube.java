package part6.ex5;

public class Tube implements Instrument{
    private String name;
    private double diameter;

    public Tube(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " " + name + " с характеристикой (диаметром) --> " + diameter + " мм");
    }
}
