package Behavioral.State;

public class Defense implements PSConsole{
    @Override
    public void X() {
        System.out.println("Defense with X button");
    }

    @Override
    public void square() {
        System.out.println("Defense with square button");
    }

    @Override
    public void round() {
        System.out.println("Defense with round button");
    }

    @Override
    public void triangle() {
        System.out.println("Defense with triangle button");
    }
}
