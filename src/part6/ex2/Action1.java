package part6.ex2;

public interface Action1 extends Action{
    default void eat()
    {
        System.out.println("Undefined");
    }
}
