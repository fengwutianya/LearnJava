package generics;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class CountedObject {
    private static int count = 0;
    private final int id = count++;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}
