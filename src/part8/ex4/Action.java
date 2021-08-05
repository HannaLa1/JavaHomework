package part8.ex4;

import javax.swing.*;
import java.awt.*;

public class Action {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Зелёный", 3, 5, 5);
        Circle circle2 = new Circle("Чёрный", 5, 8, 5);
        Rectangle rectangle1 = new Rectangle("Розовый", 2, 1, 5, 6);
        Shape rectangle2 = new Rectangle("Розовый", 2, 1, 5, 6);

        Shape[] arr = {circle1, circle2, rectangle1, rectangle2};
        for (Shape shape : arr)
        {
            shape.draw();
        }

        System.out.println();
        System.out.println(circle1.equals(circle2));
        System.out.println(circle2.equals(rectangle1));
        System.out.println(rectangle1.equals(rectangle2));
    }
}
