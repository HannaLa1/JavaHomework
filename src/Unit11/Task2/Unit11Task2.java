package Unit11.Task2;
import java.io.*;

public class Unit11Task2 {
    public static void main(String[] args) {
        String FILE_NAME_INPUT = "src/Unit11/Task2/ex4.txt";
        String FILE_NAME_OUTPUT = "src/Unit11/Task2/out.txt";
        String str = readStringFromFile(FILE_NAME_INPUT);
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String readStringFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String str;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split("\n");

                for (String s : arr) {
                    int count = Unit9.Task4.TextFormater.numberOfWords(s);

                    if((count > 2 && count < 6) || (TextFormater.isPalindrome(s))){
                        sb.append(s).append("\n");
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }

    public static void writeStringToFile(String fileName, String str) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            String[] arr = str.split("\n");
            for (String s : arr) {
                bw.write(s + "\n");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
