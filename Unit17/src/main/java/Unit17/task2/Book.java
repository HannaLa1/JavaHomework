package Unit17.task2;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"title", "yearOfPublication"}, name = "book")
public class Book {
    private String articleNumber;
    private String title;
    private int yearOfPublication;

    public String getArticleNumber() {
        return articleNumber;
    }

    @XmlAttribute
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "\nxml.Books -->" +
                "\narticleNumber: " + articleNumber +
                "\ntitle: " + title +
                "\nyearOfPublication: " + yearOfPublication +
                "\n-----------------------------------";
    }
}
