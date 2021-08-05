package part8.ex4;
import javax.swing.*;
import java.awt.*;

public abstract class Shape{
    protected String color;
    protected int corX;
    protected int corY;
    public abstract void draw();

    public Shape()
    {
        this.color = null;
        this.corX = 0;
        this.corY = 0;
    }

    public Shape(String color, int corX, int corY) {
        this.color = color;
        this.corX = corX;
        this.corY = corY;
    }
}
