package learnRTTI.learnReflection;

import java.lang.reflect.Constructor;

/**
 * Created by xuan on 2016/9/3.
 */
public class DemoNewInstanceWithparams {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person2");
        Constructor<?> cons = cls.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Jack", 20);
        System.out.println(obj);
    }
}

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2[name=" + name + ", age=" + age + "]";
    }
}
