package learnRTTI.learnReflection;

import java.lang.reflect.Constructor;

/**
 * Created by xuan on 2016/9/3.
 */
public class DemoNewInstanceWithoutDefaultConstructor {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person1");
        Object obj = cls.newInstance(); //wrong, no default constructor
        System.out.println(obj);
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1 [name=" + name + ", age=" + age + "]";
    }
}
