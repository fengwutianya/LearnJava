package container;

import java.util.ArrayList;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        for (int i = 0; i < 3; i++) {
            System.out.println(apples.get(i));
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
