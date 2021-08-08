package part9;

public class Ex1 {
    public static void main(String[] args) {

        Ex1.action("I like Java!!!");

    }
    public static void action(String str)
    {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 7) + str.substring(11));
    }
}
