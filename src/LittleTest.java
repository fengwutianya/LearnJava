import typeinfo.toys.ToyTest;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class LittleTest extends ToyTest{
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
//            System.out.println("inside catch");
            throw new RuntimeException("runtime exception");
        } finally {
            //this is gonna work anyway
            System.out.println("inside finally");
        }
        //not exception(RuntimeException) thrown, it's gonna work
        System.out.println("after catch and finally");
    }

    static void throwException() throws Exception {
        throw new Exception("Exception!");
    }
}
