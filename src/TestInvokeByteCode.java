/**
 * Created by xuan on 2017/7/26 0026.
 */
public class TestInvokeByteCode implements Runnable {
    public static void main(String[] args) {
        TestInvokeByteCode test = new TestInvokeByteCode();
        test.instanceMethod();
        ((Runnable)test).run();
        test.staticMethod();
    }

    public static void staticMethod() {
    }
    private void instanceMethod() {
        //here to invoke special
        super.equals(null);
    }

    @Override
    public void run() {
    }
}

