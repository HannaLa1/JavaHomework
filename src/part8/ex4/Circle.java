package part8.ex4;
import java.awt.*;
import java.util.Objects;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, int corX, int corY, int radius) {
        super(color, corX, corY);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисовали круг с центром в точке (" + corX + "," + corY + ") и радиусом " + radius);
        System.out.println("Цвет: " + color);
        System.out.println("________________________________________________________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return corX == circle.corX && corY == circle.corY && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(corX, corY, radius);
    }
}
