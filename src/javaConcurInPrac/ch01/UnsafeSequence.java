package javaConcurInPrac.ch01;

import net.jcip.annotations.NotThreadSafe;

/**
 * Created by xuan on 2016/10/8 0008.
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /**
     * return a unique value
     */
    public int getNext() {
        return value++;
    }
}