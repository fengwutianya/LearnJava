package timeToLoadClass.FatherStaticField;

/**
 * Created by xuan on 8/28/17.
 */
public class Father {
    public static int field = 123;

    static {
        System.out.println("Father clinit");
    }

    public static void print() {
        System.out.println("Hello world");
    }
}
