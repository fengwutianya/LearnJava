package typeinfo;

/**
 * Created by xuan on 2016/8/27 0027.
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
//        bounded = boolean.class;
    }
}
