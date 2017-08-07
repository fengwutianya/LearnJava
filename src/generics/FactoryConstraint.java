package generics;

/**
 * because of the existence of no-default-constructor class,
 * using of the Class to act as a factory is not good enough
 * here we use a factory interface to avoid that
 * Integer is final and we can do nothing about that (extends)
 * so we use an adaptor to deal with this case
 * Created by xuan on 4/1/17.
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory()).print();
        new Foo2<Widget>(new Widget.WidgetFactory()).print();
    }
}

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }

    public void print() {
        System.out.println(x);
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    //has a static factory
    public static class WidgetFactory implements FactoryI<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
