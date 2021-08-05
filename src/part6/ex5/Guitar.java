package part6.ex5;

public class Guitar implements Instrument{
    private String name;
    private int numberOfChord;

    public Guitar(String name, int numberOfChord) {
        this.name = name;
        this.numberOfChord = numberOfChord;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfChord() {
        return numberOfChord;
    }

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " " + name + " с характеристикой (количеством струн) --> " + numberOfChord);
    }
}
