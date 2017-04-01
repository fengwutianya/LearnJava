package generics.erasetype;

import java.util.ArrayList;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class ErasedType {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println("list1 type == list2 type ? " + (list1.getClass() == list2.getClass()));
    }
}
