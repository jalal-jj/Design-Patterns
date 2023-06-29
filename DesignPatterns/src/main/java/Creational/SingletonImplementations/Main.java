package Creational.SingletonImplementations;

import Creational.SingletonImplementations.Eager.EagerSingleton;
import Creational.SingletonImplementations.EnumSingleton.EnumSingleton;
import Creational.SingletonImplementations.Lazy.LazySingleton;
import Creational.SingletonImplementations.StaticBlockSingleton.StaticSingleton;

public class Main {

    /*
    Lazy - You can get different hashcodes in Lazy Singleton.
    So if Threads can reach at same time Lazy can create many instances
    Eager - this kind of solution is good but needs more space in heap
    Enum - Good solution and few codes
     */
    public static void main(String[] args) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("1st Lazy " + LazySingleton.getInstance().hashCode());
                    System.out.println("1st Eager " + EagerSingleton.getInstance().hashCode());
                    System.out.println("1st Enum " + EnumSingleton.Instance.hashCode());
                    System.out.println("1st Static Block " + StaticSingleton.getInstance().hashCode());
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("2nd Lazy " + LazySingleton.getInstance().hashCode());
                    System.out.println("2nd Eager " + EagerSingleton.getInstance().hashCode());
                    System.out.println("2nd Enum " + EnumSingleton.Instance.hashCode());
                    System.out.println("2nd Static Block " + StaticSingleton.getInstance().hashCode());
                }
            }).start();
        }


}
