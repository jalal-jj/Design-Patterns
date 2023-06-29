package Creational.SingletonImplementations.Eager;

public class EagerSingleton {

    public static final EagerSingleton Instance = new EagerSingleton();

    private EagerSingleton() {
    }
    public static EagerSingleton getInstance() {
        return Instance;
    }

}