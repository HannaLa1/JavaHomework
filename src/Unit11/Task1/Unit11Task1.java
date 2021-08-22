package Unit11.Task1;
import java.io.*;

public class Unit11Task1 {
    public static void main(String[] args) {
        String FILE_NAME_INPUT = "src/Unit11/Task1/t.txt";
        String FILE_NAME_OUTPUT = "src/Unit11/Task1/test.txt";
        String str = readStringFromFile(FILE_NAME_INPUT);
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String readStringFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(" ");

                for (String s : arr) {
                    StringBuilder stringBuilder = new StringBuilder(s);
                    if (stringBuilder.reverse().toString().equals(s)) {
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
            String[] arr = str.split(" ");
            for (String s : arr) {
                bw.write(s + "\n");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
