package part6.ex4;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Название книги --> " + name);
    }

    public static void printBooks(Printable[] printable)
    {
        for (Printable obj : printable)
        {
            if (obj instanceof Book)
            {
                obj.print();
            }
        }
    }
}
