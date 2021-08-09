package Unit9;

public class Unit9Task2 {
    public static void main(String[] args) {
        System.out.println(Unit9Task2.replace("Java Became the most BJ   programming  BJlanguage"));
    }

    public static String replace(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }
}
