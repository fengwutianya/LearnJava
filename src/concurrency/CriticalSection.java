package concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

/**
 * Created by xuan on 16-9-19.
 */

//not thread-safe class Pair
class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() { x++; }

    public void incrementY() { y++; }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    public class PairValuesNotEqualException extends RuntimeException {
        public PairValuesNotEqualException() {
            super("Pair values not equal: " + Pair.this);
        }
    }

    public void checkState() {
        if (x != y) {
            throw new PairValuesNotEqualException();
        }
    }
}

//protected Pair inside a thread-safe class
abstract class PairManager {
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected List<Pair> storage =
            Collections.synchronizedList(new ArrayList<Pair>());

    public synchronized Pair getPair(Pair p) {
        return new Pair(p.getX(), p.getY());
    }
}

public class CriticalSection {
}
