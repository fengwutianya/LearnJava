package generics;

import java.util.Iterator;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int count;
    public IterableFibonacci(int count) {
        super(count);
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    count--;
                    return IterableFibonacci.this.next();
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }

    public static void main(String[] args) {
        Iterator<Integer> iterator = new IterableFibonacci(5).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
