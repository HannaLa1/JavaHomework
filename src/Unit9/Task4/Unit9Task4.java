package Unit9.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Unit9Task4 {
    public static void main(String[] args) throws IOException {
        String FILE_NAME_INPUT = "D:\\TMSJava\\src\\Unit9\\Task4\\ex4.txt";
        String FILE_NAME_OUTPUT = "D:\\TMSJava\\src\\Unit9\\Task4\\out.txt";
        String str = parseFile(FILE_NAME_INPUT);
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String parseFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;

        StringBuilder sb = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            String[] arr = str.split("\n");

            for (String s : arr) {
                int count = TextFormater.numberOfWords(s);

                if((count > 2 && count < 6) || (TextFormater.isPalindrome(s))){
                    sb.append(s + "\n");
                }
            }
        }
        return sb.toString();
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        String[] arr = str.split("\n");
        for (String s : arr) {
            writer.write(s + "\n");
        }

        writer.close();
    }
}
