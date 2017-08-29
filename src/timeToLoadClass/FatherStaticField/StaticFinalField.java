package timeToLoadClass.FatherStaticField;

/**
 * Created by xuan on 8/28/17.
 */
public class StaticFinalField {
    public static void main(String[] args) {
        System.out.println(StaticFinal.hello);
        System.out.println(StaticFinal.world);
    }
}

class StaticFinal {
    static {
        System.out.println("------------------clinit--------------------");
    }

    /**
     * static final don't need to load class
     */
    public static final String hello = "hello";

    /**
     * but static need to load class
     */
    public static String world = "world";
}
