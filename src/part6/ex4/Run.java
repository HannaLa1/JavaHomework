package part6.ex4;

public class Run {
    public static void main(String[] args) {
        Book book1 = new Book("name of book 1");
        Book book2 = new Book("name of book 2");
        Magazine magazine1 = new Magazine("name of magazine 1");
        Magazine magazine2 = new Magazine("name of magazine 2");

        Printable[] printable1 = {book1, book2, magazine1, magazine2};

        for (Printable obj : printable1)
        {
            obj.print();
        }

        System.out.println();
        Book.printBooks(printable1);
        System.out.println();
        Magazine.printMagazines(printable1);
    }
}
