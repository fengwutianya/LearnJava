package InnerClass;

/**
 * Created by xuan on 16-10-9.
 */
public class OuterClass {
    private int i;

    class InnerClass {
        private void doOuterClass() {
            i = 4;
            System.out.println("I am a InnerClass method");
            System.out.println("calling a outerClass mehtod");
            print();
        }
    }

    private void print() {
        System.out.println("I am a outerClass method");
    }

    public static void main(String[] args) {
        new OuterClass().new InnerClass().doOuterClass();
    }
}
