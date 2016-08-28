package container;

/**
 * Created by xuan on 2016/8/4 0004.
 */
import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {return id;}
}
class Orange {}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(((Apple)apples.get(i)).id());
        }
    }
}
