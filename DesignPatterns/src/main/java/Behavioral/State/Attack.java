package Behavioral.State;

public class Attack implements PSConsole{
    @Override
    public void X() {
        System.out.println("Attacking with x button");
    }

    @Override
    public void square() {
        System.out.println("Attacking with square button");
    }

    @Override
    public void round() {
        System.out.println("Attacking with round button");
    }

    @Override
    public void triangle() {
        System.out.println("Attacking with triangle button");
    }
}
