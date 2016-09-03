package learnRTTI.learnReflection;

/**
 * Created by xuan on 2016/9/3.
 */
import java.lang.reflect.Constructor;

public class DemoGetConstructors {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person");
        Constructor<?> cons[] = cls.getConstructors();
        //can only get public constructors
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i]);
        }
    }
}

class Person {
    public Person() {}
    public Person(String name) {}
    public Person(String name, int age) {}
    protected Person(String name, int age, char sex) {}
    private Person(String name, int age, char sex, double salary) {}
}
