package part9;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(Ex7.capitalize("java      programming  language"));
    }

    public static StringBuffer capitalize(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);

        String first = stringBuffer.substring(0, 1);
        first = first.toUpperCase();
        stringBuffer.replace(0, 1, first);

        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == ' ')
            {
                String text = stringBuffer.substring(i + 1, i + 2);
                text = text.toUpperCase();
                stringBuffer.replace(i + 1, i + 2, text);
            }
        }

        return stringBuffer;
    }
}
