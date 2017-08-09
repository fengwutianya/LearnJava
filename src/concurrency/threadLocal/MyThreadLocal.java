package concurrency.threadLocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuan on 2017/8/10 0010.
 */
public class MyThreadLocal<T> {
    private Map<Thread, T> map = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T value) {
        map.put(Thread.currentThread(), value);
    }

    public T get() {
        Thread thread = Thread.currentThread();
        T value = map.get(thread);
        if (value == null && !map.containsKey(thread)) {
            value = initialValue();
            map.put(thread, value);
        }
        return value;
    }

    private T initialValue() {
        return null;
    }
}
