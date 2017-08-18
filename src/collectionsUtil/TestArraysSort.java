package collectionsUtil;

import java.util.*;

/**
 * Created by xuan on 2017/8/11 0011.
 */
public class TestArraysSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3 ,10, 7, 4, 2};
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.println(i);
        }

        String[] arrString = {"hello", "ello", "llo", "lo", "o"};
        Arrays.sort(arrString, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });

        for (String s : arrString) {
            System.out.println(s);
        }

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(19);
        integerList.add(10);
        integerList.add(2);
        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : integerList) {
            System.out.println(i);
        }
    }
}
