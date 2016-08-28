package container;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by xuan on 2016/8/4 0004.
 */
public class CounterWithoutAutoboxing {
    private static final Integer ONE = new Integer(1);

    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i = 0; i < args.length; i++) {
            Integer freq = (Integer)map.get(args[i]);
            map.put(args[i],
                    (freq == null? ONE : new Integer(freq.intValue() + 1)));
        }
        System.out.println(map.size() + " distinct words detected;");
        System.out.println(map);
    }
}
