package javaConcurInPrac;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;
/**
 * Created by xuan on 2016/10/8 0008.
 */
@ThreadSafe
public class Sequence {
    @GuardedBy("this")
    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
