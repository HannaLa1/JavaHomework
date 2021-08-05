package part6.ex5;

public class Drum implements Instrument{
    private String name;
    private String size;

    public Drum(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " " + name + " с характеристикой (размером) --> " + size);
    }
}
