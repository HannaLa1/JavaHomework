package Unit5.part2;

public class Action
{
    public static void main(String[] args)
    {
        Reader []reader = new Reader[2];
        reader[0] = new Reader("Петров В.В.",173,
                "КСИС","17.09.2001", "+375293678793");
        reader[1] = new Reader("Иванов И.В.",134,
                "ФКП","24.01.2000", "+375299876541");

        Book book1 = new Book("\"Программирование на Java\"", "Васильев А.Н.");
        Book book2 = new Book("\"ООП в C++\"", "Р. Лафоре");
        Book book3 = new Book("\"Атомная и ядерная физика\"", "Ландсберг Г.С.");

        for (int i = 0; i < reader.length; i++)
        {
            System.out.println(reader[i]);
        }

        reader[0].takeBook(4);
        reader[0].takeBook("Словарь", "Энциклипедия");
        reader[0].takeBook(book1, book2);

        reader[0].returnBook(2);
        reader[0].returnBook("Приключения");
        reader[0].returnBook(book3);

        System.out.println( "-------------------------------------------------");

        reader[1].takeBook(5);
        reader[1].takeBook("Приключения", "Энциклипедия");
        reader[1].takeBook(book1, book2, book3);

        reader[1].returnBook(1);
        reader[1].returnBook("Словарь");
    }
}
