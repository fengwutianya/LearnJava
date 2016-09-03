package learnRTTI.learnReflection;

import java.lang.reflect.Field;

/**
 * Created by xuan on 2016/9/3.
 */
public class DemoGetAccessFields {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person6");
        Object obj = cls.newInstance();
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);  //�����װ��������ôţ��
        nameField.set(obj, "xuanxuan");
        System.out.println(nameField.get(obj));
    }
}

class Person6 {
    private String name;
}
