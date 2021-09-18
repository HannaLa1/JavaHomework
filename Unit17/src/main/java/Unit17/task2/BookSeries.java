package Unit17.task2;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"booksFromTheSameSeries"}, name = "bookSeries")
@XmlRootElement
public class BookSeries {
    private List<Book> booksFromTheSameSeries = new ArrayList<>();

    @XmlElementWrapper(name = "booksFromTheSameSeries")
    @XmlElement(name = "book")
    public List<Book> getBooksFromTheSameSeries() {
        return booksFromTheSameSeries;
    }

    public void setBooksFromTheSameSeries(List<Book> booksFromTheSameSeries) {
        this.booksFromTheSameSeries = booksFromTheSameSeries;
    }

    @Override
    public String toString() {
        return "xml.BookSeries -->" +
                "\n***********************************" +
                "\nbooksFromTheSameSeries: " + booksFromTheSameSeries;
    }
}
