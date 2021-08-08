package part9;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(Ex6.uppercaseLetter("java programming language"));
    }

    public static StringBuffer uppercaseLetter(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);

        String text = stringBuffer.substring(0, 1);
        text = text.toUpperCase();

        stringBuffer.replace(0, 1, text);
        return stringBuffer;
    }
}
