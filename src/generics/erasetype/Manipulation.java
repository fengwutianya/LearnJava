package generics.erasetype;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        new Manipulator<HasF>(hasF).manipulate();
    }
}

class Manipulator<T extends HasF> {
    private T obj;
    public Manipulator(T obj) {
        this.obj = obj;
    }
    public void manipulate() {
        obj.f();
    }
}
