package part9;

import java.util.Formatter;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(Ex4.deleteCharacters("Hello World", 5));
    }

    public static StringBuffer deleteCharacters(String str, int length) {
        StringBuffer stringBuffer = new StringBuffer(str);

        stringBuffer.delete(length + 1, str.length());
        return stringBuffer;
    }
}
