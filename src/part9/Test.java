package part9;

public class Test {
    public static void main(String[] args) {
        String str = "HelloWorld fsgts Hello";
        String test = " asdf Hello WORlD ";
        char[] arr = new char[4];

        System.out.println(test.endsWith("WORlD"));
        System.out.println(test.equalsIgnoreCase(str));
        str = str.concat("test");
        System.out.println(str);

        String str1 = String.valueOf(12);
        System.out.println(str1);

        System.out.println(String.join(" ", str, str1));
        System.out.println(str.compareTo(test));
        System.out.println(str.charAt(2));
        str.getChars(0, 3, arr, 0);
        for(char s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(str.equals(test));
        System.out.println(test.indexOf("Hello"));
        System.out.println(str.lastIndexOf("Hello"));
        System.out.println(test.startsWith("WORLD"));
        System.out.println(test.replace("H", "a"));
        System.out.println(test.trim());
        System.out.println(str.substring(2));
        System.out.println(str.toLowerCase());
        System.out.println(test.toUpperCase());
    }
}
