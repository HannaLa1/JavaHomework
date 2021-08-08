package Unit9.Task4;

public class TextFormater {
    public static int numberOfWords(String str) {
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        boolean flag = false;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                flag = true;
            }
        }

        if (flag){
            return true;
        }
        return false;
    }
}
