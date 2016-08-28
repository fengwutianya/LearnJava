import typeinfo.toys.ToyTest;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class LittleTest extends ToyTest{
    public static void main(String[] args) {
        LittleTest lt = new LittleTest();
        Class c = lt.getClass();
        System.out.println(c);
        System.out.println(c.getSuperclass());
    }
}
