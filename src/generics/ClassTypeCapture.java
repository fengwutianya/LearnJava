package generics;

/**
 * Created by xuan on 4/1/17.
 */
public class ClassTypeCapture<T> {
    //instanceof cannot be use
    //then isInstance() method
    private Class<T> type;
    public ClassTypeCapture(Class<T> type) {
        this.type = type;
    }

    public boolean f(Object arg) {
        return type.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cc =
                new ClassTypeCapture<>(Building.class);
        System.out.println(cc.f(new Building()));
        System.out.println(cc.f(new House()));
    }
}

class Building {}
class House extends Building {}


