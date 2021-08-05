package part6.ex3;

public class Run {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(3, 5);
        Ball ball = new Ball(3.5);
        Pyramid pyramid = new Pyramid(125, 80);

        Box box = new Box(1200);

        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
        System.out.println(box.add(pyramid));
    }
}
