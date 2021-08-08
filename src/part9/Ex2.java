package part9;

public class Ex2 {
    public static void main(String[] args) {
        Ex2.action(3, 56);
    }

    public static void action(int num1, int num2)
    {
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();

        System.out.println(stringBuffer1.append(num1).append("+").append(num2).append("=").append(num1+num2));
        System.out.println(stringBuffer2.append(num1).append("-").append(num2).append("=").append(num1-num2));
        System.out.println(stringBuffer3.append(num1).append("*").append(num2).append("=").append(num1*num2));
        System.out.println();

        stringBuffer1 = stringBuffer1.deleteCharAt(4);
        stringBuffer1 = stringBuffer1.insert(4, "равно");
        System.out.println(stringBuffer1.toString());
        stringBuffer2 = stringBuffer2.deleteCharAt(4);
        stringBuffer2 = stringBuffer2.insert(4, "равно");
        System.out.println(stringBuffer2.toString());
        stringBuffer3 = stringBuffer3.deleteCharAt(4);
        stringBuffer3 = stringBuffer3.insert(4, "равно");
        System.out.println(stringBuffer3.toString());

        System.out.println();
        System.out.println(stringBuffer1.replace(4, 9, "равно"));
        System.out.println(stringBuffer2.replace(4, 9, "равно"));
        System.out.println(stringBuffer3.replace(4, 9, "равно"));
    }
}
