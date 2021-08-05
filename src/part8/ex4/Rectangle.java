package part8.ex4;

import java.awt.*;
import java.util.Objects;

public class Rectangle extends Shape{

    private int wight;
    private int height;

    public Rectangle(String color, int corX, int corY, int wight, int height) {
        super(color, corX, corY);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовали прямоугольник в точке (" + corX + "," + corY + ")" +
                           " с высотой равной " + height + " и шириной равной " + wight);
        System.out.println("Цвет: " + color);
        System.out.println("________________________________________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return corX == rectangle.corX && corY == rectangle.corY && wight == rectangle.wight
                && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(corX, corY, wight, height);
    }
}
