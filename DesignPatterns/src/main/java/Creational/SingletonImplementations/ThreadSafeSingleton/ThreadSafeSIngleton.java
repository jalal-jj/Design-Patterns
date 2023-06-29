package Creational.SingletonImplementations.ThreadSafeSingleton;

public class ThreadSafeSIngleton {

    private static ThreadSafeSIngleton instance;

    private ThreadSafeSIngleton(){

    }

/*     Also you can implement your code with Locks instead of synchronized keyword
       see java.util.concurrent.locks;
*/
    public static synchronized ThreadSafeSIngleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeSIngleton();
        }
        return instance;
    }


}
