package Unit17.task3;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("Article number")
    private String articleNumber;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year of publication")
    private int yearOfPublication;

    public String getArticleNumber() {
        return articleNumber;
    }

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
        return "\njson.Books -->" +
                "\narticleNumber: " + articleNumber +
                "\ntitle: " + title +
                "\nyearOfPublication: " + yearOfPublication +
                "\n-----------------------------------";
    }
}
