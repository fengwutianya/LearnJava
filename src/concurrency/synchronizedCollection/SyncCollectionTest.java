package concurrency.synchronizedCollection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by xuan on 2017/8/30 0030.
 */
public class SyncCollectionTest {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    }
}
