package learnRTTI.learnReflection;

/**
 * Created by xuan on 2016/9/3.
 */
import java.lang.reflect.Field;

public class DemoGetDeclaredFields {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person5");
//        Field[] fields = cls.getFields();   // got nothing
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
    }
}

class Person5 {
    private String name;
}
