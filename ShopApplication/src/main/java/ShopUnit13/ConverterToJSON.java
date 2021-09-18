package ShopUnit13;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConverterToJSON {
    private final static String baseFile = "ShopApplication/src/main/java/ShopUnit13/jsonResult.json";

    public static void toJSON(List<Product> productList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), productList);
    }
}
