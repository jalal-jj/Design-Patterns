package Creational.SingletonImplementations.ReflectionForDestroyingSingletonPattern;

import Creational.SingletonImplementations.Lazy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonPattern {

    /*
        There we destroy the other Singleton Pattern using Java Reflection API
     */
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazy1st = LazySingleton.getInstance();
        LazySingleton lazy2nd = null;
        try {
            Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                constructor.setAccessible(true);
                lazy2nd=(LazySingleton)constructor.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // We get different hashcodes
        System.out.println(lazy1st.hashCode());
        System.out.println(lazy2nd.hashCode());
    }


}
