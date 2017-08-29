package timeToLoadClass.FatherStaticField;

/**
 * Created by xuan on 8/28/17.
 */
public class Main {
    /**
     * there can be things done before main()
     * which is static {}
     */
    static {
        System.out.println("Main clinit");
    }

    /**
     * if static field or method is inherited from father, then
     * Class son is not gonna be loaded.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Son.field);
        Son.print();
    }
}
