package Unit1;

public class Unit1Task0 {
    public static void main (String args[]){
        int month = 9;
        int day = 12;

        System.out.println("Arithmetic operators -->");
        System.out.println("month + day = " + (month + day));
        System.out.println("month - day = " + (month - day));
        System.out.println("month * day = " + (month * day));
        System.out.println("month / day = " + (month / day));
        System.out.println("month % day = " + (month % day));
        System.out.println("month += day --> month = " + (month += day));
        System.out.println("month -= day --> month = " + (month -= day));
        System.out.println("month *= day --> month = " + (month *= day));
        System.out.println("month /= day --> month = " + (month /= day));
        System.out.println("month %= day --> month = " + (month %= day));
        System.out.println("++month * day-- = " + (++month * day--));

        System.out.println("\nBitwise operators -->");
        System.out.println("month | day = " + (month | day));
        System.out.println("month & day = " + (month & day));
        System.out.println("month ^ day = " + (month ^ day));
        System.out.println("~month + ~day = " + (~month + ~day));
        System.out.println("(month >> 1) + (day << 1) = " + ((month >> 1) + (day << 1)));

        System.out.println("\nLogical operators and comparison operators -->");
        if (month == 3 || day < 14)
        {
            System.out.println("The condition || is true");
        }
        else if (month >= 4 && day == 5)
        {
            System.out.println("The condition && is true");
        }
        else if (month != day)
        {
            System.out.println("The condition != is true");
        }
        else
        {
            System.out.println("None of the conditions is completed!");
        }
    }
}

