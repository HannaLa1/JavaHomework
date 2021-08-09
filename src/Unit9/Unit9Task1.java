package Unit9;

public class Unit9Task1 {
    public static void main(String[] args) {
        System.out.println(Unit9Task1.cutSubstring("JAvA Became the most B   programming  Blanguage"));
    }

    public static String cutSubstring(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);

        int a = str.indexOf("A");
        int b = str.lastIndexOf("B");

        return stringBuffer.substring(a, b);
    }
}
