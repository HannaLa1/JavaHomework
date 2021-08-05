package part6.ex2;

public interface Action2 extends Action{
    default void beEating()
    {
        System.out.println("Undefined");
    }
}
