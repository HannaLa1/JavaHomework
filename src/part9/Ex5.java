package part9;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(Ex5.insert_dash("Java programming language"));
    }

    public static String insert_dash(String str) {
        str = str.toUpperCase();
        str = str.replace(" ", "-");
        return str;
    }
}
