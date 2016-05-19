package learnio;

/**
 * Created by xuan on 16-3-16.
 */
public class TestInnerClass {
    private class OneTest implements MyTest {
        @Override
        public void test() {

        }
    }

    private MyTest myTest() {
        return new OneTest();
    }
    public static void main(String[] args) {
        new TestInnerClass().myTest();
    }
}

interface MyTest {
    void test();
}
