package Unit11.Task2;

public class TextFormater {
    public static int numberOfWords(String str) {
        return str.split(" ").length;
    }

    public static boolean isPalindrome(String str) {
        String[] arr = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s);

            if (stringBuilder.reverse().toString().equals(s)) {
               return true;
            }
        }
        return false;
    }
}
