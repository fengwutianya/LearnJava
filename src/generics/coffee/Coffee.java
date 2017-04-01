package generics.coffee;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
