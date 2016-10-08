package javaConcurInPrac.ch02;

import net.jcip.annotations.NotThreadSafe;

/**
 * Created by xuan on 2016/10/8 0008.
 */
@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (instance == null) {     //race
            instance = new ExpensiveObject();
        }
        return instance;
    }
}

class ExpensiveObject {}
