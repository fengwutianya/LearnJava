package container;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class CounterWithAutoboxing {
    public static void main(String[] args) {
        Map map = new TreeMap();
        for (int i = 0; i < args.length; i++) {
            Integer freqInteger = (Integer)map.get(args[i]);
            int freq = freqInteger == null ? 0 : freqInteger.intValue();
            map.put(args[i], freq + 1);
        }
        System.out.println(map.size() + " distinct words detected;");
        System.out.println(map);
    }
}
