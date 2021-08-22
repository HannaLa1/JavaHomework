package part11;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws URISyntaxException {
        try {
            Test.action();
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void action() throws FileNotFoundException, URISyntaxException {
        Random random = new Random();

        switch (1 + random.nextInt(4)) {
            case 1 -> throw new NullPointerException("Cсылка на объект, к которому вы обращаетесь хранит null!");
            case 2 -> throw new ArithmeticException("Недопустимая арифметическая операция!");
            case 3 -> throw new FileNotFoundException("Файл не найден!");
            default -> throw new URISyntaxException("","");
        }
    }
}
