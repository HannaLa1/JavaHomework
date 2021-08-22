package Unit11.Task3;
import java.io.*;

public class Unit11Task3 {
    public static void main(String[] args) {
        String FILE_NAME_INPUT1 = "src/Unit11/Task3/text.txt";
        String FILE_NAME_INPUT2 = "src/Unit11/Task3/black_list.txt";
        String FILE_NAME_OUTPUT = "src/Unit11/Task3/result.txt";
        String str = parseFile(FILE_NAME_INPUT1, parseFile2(FILE_NAME_INPUT2));
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String parseFile(String fileName, String s) {
        StringBuilder sb = new StringBuilder();

        try( BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;
            int count = 0;
            boolean flag = false;

            while ((str = br.readLine()) != null){
                String[] arr = str.split("\n");

                for (String word : arr){
                    if(TextFormater.checkingForCensorship(word, s)) {
                        sb.append(word).append("\n");
                        count++;
                        flag = true;
                    }
                }
            }
            if(!flag){
                sb.append("Текст прошёл проверку на цензуру!");
            }else {
                sb.append("\nТекст не прошёл проверку на цензуру!").append("\nКоличество предложений: ").append(count);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        return sb.toString();
    }

    public static String parseFile2(String fileName) {
        StringBuilder sb = new StringBuilder();

        try( BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null){
                String[] arr = str.split("\n");

                for (String s : arr){
                    sb.append(s).append(" ");
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        return sb.toString();
    }

    public static void writeStringToFile(String fileName, String str) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            String[] arr = str.split("\n");
            for (String s : arr){
                bw.write(s + "\n");
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
