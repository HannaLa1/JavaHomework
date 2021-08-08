package Unit9;

import java.io.*;

public class Unit9Task3 {
    public static void main(String[] args) throws IOException {
        String FILE_NAME_INPUT = "D:\\TMSJava\\src\\Unit9\\t.txt";
        String FILE_NAME_OUTPUT = "D:\\TMSJava\\src\\Unit9\\test.txt";
        String str = readFromFile(FILE_NAME_INPUT);
        writeStringToFile(FILE_NAME_OUTPUT, str);
    }

    public static String readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;

        StringBuilder sb = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            String[] arr = str.split(" ");

            for (String s : arr) {
                boolean flag = false;

                for (int i = 0; i < s.length() / 2; ++i) {
                    if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                        flag = true;
                    }
                }
                if (flag){
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
