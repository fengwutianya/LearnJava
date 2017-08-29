package timeToLoadClass.FatherStaticField;

/**
 * Created by xuan on 8/28/17.
 */
public class Son extends Father {
    static {
        System.out.println("son clinit");
    }

    public static void print() {
        System.out.println("I am null but I can do things");
    }
}
