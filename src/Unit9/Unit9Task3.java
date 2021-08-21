package Unit9;
import java.io.*;

public class Unit9Task3 {
    public static void main(String[] args) throws IOException {
        String FILE_NAME_INPUT = "D:\\TMSJava\\src\\Unit9\\t.txt";
        String FILE_NAME_OUTPUT = "D:\\TMSJava\\src\\Unit9\\test.txt";
        String str = parseFile(FILE_NAME_INPUT);
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String parseFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;

        StringBuilder sb = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            String[] arr = str.split(" ");

            for (String s : arr) {
                StringBuilder stringBuilder = new StringBuilder(s);
                if (stringBuilder.reverse().toString().equals(s)) {
                    sb.append(s + "\n");
                }
            }
        }
        return sb.toString();
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        String[] arr = str.split(" ");
        for (String s : arr) {
            writer.write(s + "\n");
        }

        writer.close();
    }
}
