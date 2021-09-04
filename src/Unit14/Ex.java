package Unit14;
import java.util.List;
import java.util.stream.Collectors;

public class Ex {
    public static void main(String[] args) {
        List<String> words = List.of("asdferwf", "sdferf", "sdffds", "sdfjkdsf",
                "asdfgfdsa", "srtydytrs", "tttdttt", "mawdasdqwdam", "asdsflsgh");

        List<String> palindrome = words.stream()
                .filter(x -> new StringBuilder(x).reverse().toString().equals(x))
                .collect(Collectors.toList());

        palindrome.forEach(System.out::println);
    }
}
