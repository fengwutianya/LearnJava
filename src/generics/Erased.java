package generics;

import org.junit.Test;

/**
 * Created by xuan on 4/1/17.
 */
public class Erased<T> {
    private final int SIZE = 100;
    @Test
    public void f(Object arg) {
//        if (arg instanceof T) {}
//        T var = new T();
//        T[] arr = new T[10];
        T[] arr = (T[]) new Object[10];
    }
}
