package learnRTTI;

/**
 * Created by xuan on 2016/9/2.
 */
public class DemoGetClass {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getClass().getName());
//        System.out.println(person.getClass().getClass().getClass());
    }
}

class Person {

}
