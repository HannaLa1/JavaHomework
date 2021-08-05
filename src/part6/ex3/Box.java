package part6.ex3;
import java.util.ArrayList;
import java.util.Arrays;

public class Box extends Shape{

    //private ArrayList<Shape> shapes = new ArrayList<>();
    private double maxVolume;
    private final double LOAD = 0.5;
    private Shape[] arr = new Shape[10];
    private int index = 0;

    public Box(double maxVolume) {
        super(maxVolume);
        this.maxVolume = maxVolume;
    }

    public boolean add(Shape shape)
    {
        if (maxVolume >= shape.getVolume()) {
            if(index >= arr.length * LOAD)
            {
                arr = Arrays.copyOf(arr, arr.length + 10);
            }
            arr[index++] = shape;
            //shapes.add(shape);
            maxVolume -= shape.getVolume();
            return true;
        }
        else {
            return false;
        }
    }
}
