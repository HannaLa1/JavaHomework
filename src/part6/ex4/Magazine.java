package part6.ex4;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Название журнала --> " + name);
    }

    public static void printMagazines(Printable[] printable)
    {
        for (Printable obj : printable)
        {
            if (obj instanceof Magazine)
            {
                obj.print();
            }
        }
    }
}
