package Unit17.task2;

import Unit17.task1.Family;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
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

    public void marshallExample() {
        try {
            File file = new File("Unit17/src/main/java/Unit17/task2/result.xml");
            JAXBContext context = JAXBContext.newInstance(BookSeries.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObject(), file);
        }catch (JAXBException exception){
            Logger.getLogger(Application.class.getName()).
                    log(Level.SEVERE, "marshallExample threw JAXBException", exception);
        }
    }

    public void unMarshallExample(){
        try {
            File file = new File("Unit17/src/main/java/Unit17/task2/result.xml");
            JAXBContext context = JAXBContext.newInstance(BookSeries.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            BookSeries unmarshal = (BookSeries) unmarshaller.unmarshal(file);
            System.out.println(unmarshal);
        } catch (JAXBException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.marshallExample();
        application.unMarshallExample();
    }
}
