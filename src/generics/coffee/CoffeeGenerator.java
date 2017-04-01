package generics.coffee;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Random random;
    private final Class[] classes = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private int size;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public CoffeeGenerator(){
        this(0);
    }

    @Override
    public Coffee next() {
        random = new Random();
        try {
            return (Coffee) classes[random.nextInt(classes.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;

        @Override
        public boolean hasNext() {
            return size > 0;
        }

        @Override
        public Coffee next() {
            if (count-- > 0)
                return CoffeeGenerator.this.next();
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        Iterator cg = new CoffeeGenerator(1).iterator();
        System.out.println(cg.next());
        System.out.println(cg.next());
        System.out.println(cg.next());
    }
}
