package part6.ex2;

public interface Action {
    default void move()
    {
        System.out.println("Undefined");
    }
}
