package learn.exception;

/**
 * Created by xuan on 2017/7/27 0027.
 */
public class TryCatchFinally {
    private void insideTry(){
        System.out.println("inside try");
    }
    private void insideCatch() {
        System.out.println("inside catch");
    }
    private void insideFinally() {
        System.out.println("inside finally");
    }

//    public static void main(String[] args) {
//        TryCatchFinally obj = new TryCatchFinally();
//        try {
//            obj.insideTry();
//            throw new Exception("wokao");
//        }catch (Exception e) {
//            obj.insideCatch();
//        }finally {
//            obj.insideFinally();
//        }
//        System.out.println("after finally");
//    }
    public int test() {
        int i = 0;
        try {
            insideTry();
            throw new Exception("wo kao");
//            i = 1;
//            return i;
        } catch (Exception e) {
            insideCatch();
            i = 2;
            return i;
        } finally {
            insideFinally();
            i = 3;
//            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TryCatchFinally().test());
    }
}
