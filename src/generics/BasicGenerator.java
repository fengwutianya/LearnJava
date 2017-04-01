package generics;

import generics.coffee.Generator;
import org.junit.Test;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> BasicGenerator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    public static void main(String[] args) {
        String a = create(String.class).next();
        System.out.println(a);
    }
}
