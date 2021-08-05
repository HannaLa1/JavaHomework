package part6.ex5;

public class Run {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("гитара", 12);
        Drum drum = new Drum("барабан", "средний");
        Tube tube = new Tube("труба", 11);

        Instrument[] arr = {guitar, drum, tube};
        for (Instrument instrument : arr)
        {
            instrument.play();
        }
    }
}
