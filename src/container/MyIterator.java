package container;

import java.util.*;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class MyIterator {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add(new Name("xuanxuan", "zhu"));
        collection.add(new Name("mengyi", "zhu"));
        collection.add(new Name("yafei", "zhu"));
        collection.add(new Name("yafei", "zhu"));
        collection.add(new Name("yafei", "zhu"));
        collection.add(new Name("qihang", "zhu"));
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(collection);
            Name name = (Name)iterator.next();
//            collection.remove(name);
            iterator.remove();
        }
        while (iterator.hasNext()) {
            Name name = (Name)iterator.next();
            System.out.println(name);
        }
    }
}
