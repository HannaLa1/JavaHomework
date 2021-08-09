package part9;

import java.util.Formatter;

public class Ex3 {
    public static void main(String[] args) {
        Ex3.action("Иванов", 5, "Математике");
        Ex3.action("Петрова", 4, "Физике");
        Ex3.action("Сидорова", 3, "Программированию");
    }

    public static void action(String surname, int mark, String nameOfSubject) {
        Formatter formatter = new Formatter();

        formatter.format("Студент %-15s получил %-3s по %-10s", surname, mark, nameOfSubject);
        System.out.println(formatter);
    }
}
