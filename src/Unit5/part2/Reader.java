package Unit5.part2;

public class Reader {
    String initials;
    int number;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    Reader(String initials, int number, String faculty, String dateOfBirth, String phoneNumber)
    {
        this.initials = initials;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    void takeBook(int count)
    {
        if ((count % 10 > 0 && count % 10 < 9 && count % 100 / 10 == 1) || count % 10 == 0)
        {
            System.out.println(initials + " взял(а) " + count + " книг -->");
        }
        else if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4)
        {
            System.out.println(initials + " взял(а) " + count + " книги -->");
        }
        else if (count % 10 == 1)
        {
            System.out.println(initials + " взял(а) " + count + " книгу -->");
        }
        else
        {
            System.out.println(initials + " взял(а) " + count + " книг -->");
        }
    }

    void takeBook(String... nameOfBook)
    {
        System.out.print(initials + " взял(а) книги: ");
        for (int i = 0; i < nameOfBook.length; i++)
        {
            System.out.print(((i > 0) ? ", " : "") + nameOfBook[i]);
        }
        System.out.println();
    }

    void takeBook(Book... obj)
    {
        System.out.print(initials + " взял(а) книги: ");
        for (int i = 0; i < obj.length; i++)
        {
            System.out.print(((i > 0) ? ", " : "") + obj[i].nameOfBook + " " + obj[i].initialsOfAuthor);
        }
        System.out.println();
    }

    void returnBook(int count)
    {
        if ((count % 10 > 0 && count % 10 < 9 && count % 100 / 10 == 1) || count % 10 == 0)
        {
            System.out.println(initials + " вернул(а) " + count + " книг -->");
        }
        else if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4)
        {
            System.out.println(initials + " вернул(а) " + count + " книги -->");
        }
        else if (count % 10 == 1)
        {
            System.out.println(initials + " вернул(а) " + count + " книгу -->");
        }
        else
        {
            System.out.println(initials + " вернул(а) " + count + " книг -->");
        }
    }

    void returnBook(String... nameOfBook)
    {
        System.out.print(initials + " вернул(а) книги: ");
        for (int i = 0; i < nameOfBook.length; i++)
        {
            System.out.print(((i > 0) ? ", " : "") + nameOfBook[i]);
        }
        System.out.println();
    }

    void returnBook(Book... obj)
    {
        System.out.print(initials + " вернул(а) книги: ");
        for (int i = 0; i < obj.length; i++)
        {
            System.out.print(((i > 0) ? ", " : "") + obj[i].nameOfBook + " " + obj[i].initialsOfAuthor);
        }
        System.out.println();
    }

    @Override
    public String toString()
    {
        return  "-------------------------------------------------" +
                "\nИнформация о студенте -->" +
                "\nФИО: " + initials +
                "\nНомер читательского билета: " + number +
                "\nФакультет: " + faculty +
                "\nДата рождения: " + dateOfBirth +
                "\nТелефон: " + phoneNumber + "\n" +
                "-------------------------------------------------\n";
    }
}
