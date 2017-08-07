package learnRTTI;

/**
 * Created by xuan on 2016/9/2.
 */
public class DemoForName {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cls = Class.forName("learnRTTI.Person2");
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
    }
}

class Person2 {}
