package learnRTTI.learnReflection;

/**
 * Created by xuan on 2016/9/3.
 */
import java.lang.reflect.Method;

public class DemoGetMethods {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("learnRTTI.learnReflection.Person3");
        Method mets[] = cls.getMethods();
        for (int i = 0; i < mets.length; i++) {
            System.out.println(mets[i]);
        }
    }
}

class Person3 {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
