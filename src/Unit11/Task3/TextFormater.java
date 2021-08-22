package Unit11.Task3;

public class TextFormater {
    public static boolean checkingForCensorship(String str1, String str2){
        String[] arr1 = str1.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        String[] arr2 = str2.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        boolean flag = false;

        for (String s1 : arr1) {
            for (String s2 : arr2){
                if (s1.equals(s2)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
