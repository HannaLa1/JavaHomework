package Unit17.task3;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile = "Unit17/src/main/java/Unit17/task3/result.json";

    public static void toJSON(BookSeries bookSeries) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), bookSeries);
        System.out.println("json created!");
    }

    public static BookSeries toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), BookSeries.class);
    }
}
