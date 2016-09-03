package learnRTTI;

/**
 * Created by xuan on 2016/9/2.
 */
public class DemoNewInstance {
    public static void main(String[] args)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException {
        Class<?> cls = Class.forName("learnRTTI.Person3");
        Object object = cls.newInstance();
        Person3 person3 = (Person3)object;
        System.out.println(person3);
    }
}

class Person3 {
    @Override
    public String toString() {
        return "Person3 Class Instance. ";
    }
}
