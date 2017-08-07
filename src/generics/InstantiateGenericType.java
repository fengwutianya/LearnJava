package generics;

/**
 * Integer has no default constructor : Public Integer() {}
 * so it's gonna throw a exception when using Integer.class.newInstance();
 * we can use Constructor if Reflection to do this.
 * so it's not recommended to use class as a factory
 * Created by xuan on 4/1/17.
 */
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Integer> caf =
                new ClassAsFactory<>(Integer.class);
        System.out.println(caf.getX());
    }
}

class ClassAsFactory<T> {
    private T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public T getX() {
        return x;
    }
}

class employee {}
