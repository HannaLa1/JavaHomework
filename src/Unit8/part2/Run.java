package Unit8.part2;

public class Run {
    public static void main(String[] args) {
        IStart iStart1 = new Shuttle();
        IStart iStart2 = new SpaceX();
        IStart iStart3 = new BlueOrigin();
        Cosmodrome cosmodrome1 = new Cosmodrome();
        Cosmodrome cosmodrome2 = new Cosmodrome();
        Cosmodrome cosmodrome3 = new Cosmodrome();

        cosmodrome1.launch(iStart1);
        cosmodrome2.launch(iStart2);
        cosmodrome3.launch(iStart3);
    }
}
