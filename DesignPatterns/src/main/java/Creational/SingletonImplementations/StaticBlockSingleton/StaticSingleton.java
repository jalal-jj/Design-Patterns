package Creational.SingletonImplementations.StaticBlockSingleton;

public class StaticSingleton {

    private static StaticSingleton instance;

    private StaticSingleton() {
    }

    static {
        try {
            instance = new StaticSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Your Exception");
        }
    }

    public static StaticSingleton getInstance() {
        return instance;
    }


}
