package part6.ex1;

public class CelsiusConverter extends BaseConverter{

    @Override
    double covert(double from) {
        System.out.println("Convert to celsius");
        return from * 2;
    }
}
