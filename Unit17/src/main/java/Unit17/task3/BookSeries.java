package Unit17.task3;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class BookSeries {
    @JsonProperty("Books from the same series")
    private final List<Book> booksFromTheSameSeries = new ArrayList<>();

    public List<Book> getBooksFromTheSameSeries() {
        return booksFromTheSameSeries;
    }

    @Override
    public String toString() {
        return "xml.BookSeries -->" +
                "\n***********************************" +
                "\nbooksFromTheSameSeries: " + booksFromTheSameSeries;
    }
}
