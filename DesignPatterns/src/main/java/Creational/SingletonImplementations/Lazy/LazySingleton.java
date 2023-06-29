package Creational.SingletonImplementations.Lazy;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if (instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
