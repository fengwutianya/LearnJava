package learnRTTI.learnReflection;

import java.lang.reflect.Method;

/**
 * Created by xuan on 2016/9/3.
 */
public class DemoReflectObjectSubclassMethods {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person4");
        Object obj = cls.newInstance();
        String attribute = "name";
        Method setMet = cls.getMethod("set" + initcap(attribute), String.class);
        Method getMet = cls.getMethod("get" + initcap(attribute));
        setMet.invoke(obj, "Jack");
        System.out.println(getMet.invoke(obj));
    }

    public static String initcap(String str) {
        return str.substring(0,1).toUpperCase().concat(str.substring(1));
    }
}

class Person4 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
