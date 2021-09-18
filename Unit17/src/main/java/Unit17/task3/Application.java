package Unit17.task3;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public Book createBook(String articleNumber, String title, int yearOfPublication) throws ParseException {
        Book bookSeries = new Book();
        bookSeries.setArticleNumber(articleNumber);
        bookSeries.setTitle(title);
        bookSeries.setYearOfPublication(yearOfPublication);
        return bookSeries;
    }

    public BookSeries createJavaObject() {
        BookSeries bookSeries = new BookSeries();

        try {
            bookSeries.getBooksFromTheSameSeries().add(createBook("978-5-17-099056-6",
                    "The picture of Dorian Gray", 2019));
            bookSeries.getBooksFromTheSameSeries().add(createBook("978-5-17-105398-7",
                    "Arc de Triomphe", 2017));
            bookSeries.getBooksFromTheSameSeries().add(createBook("978-5-699-81406-0",
                    "Programming on Java", 2020));
        }catch (ParseException exception){
            Logger.getLogger(Application.class.getName()).
                    log(Level.ALL,"createJavaObject threw ParseException", exception);
        }

        return bookSeries;
    }

    public static void main(String[] args) throws IOException {
        Converter.toJSON(new Application().createJavaObject());
        System.out.println(Converter.toJavaObject());
    }
}
