package learnRTTI;

/**
 * Created by xuan on 2016/9/2.
 */
public class DemoDotClass {
    public static void main(String[] args) {
        Class<?> cls = Person1.class;
        System.out.println(cls.getName());
    }
}

class Person1 {

}
