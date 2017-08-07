import package1.Father;
import typeinfo.toys.ToyTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.lang.reflect.Field;

/**
 * Created by xuan on 2016/8/4 0004.
 */
public class LittleTest extends ToyTest{
    public static void main(String[] args) {
//        try {
//            throwException();
//        } catch (Exception e) {
////            System.out.println("inside catch");
//            throw new RuntimeException("runtime exception");
//        } finally {
//            //this is gonna work anyway
//            System.out.println("inside finally");
//        }
//        //not exception(RuntimeException) thrown, it's gonna work
//        System.out.println("after catch and finally");
//        Class cl = int[].class;
//        cl = Double[].class;
//        cl = double[].class;
//        cl = ToyTest.class;
//        B.print();
    }

    static void throwException() throws Exception {
        throw new Exception("Exception!");
    }

    public void test() throws FileNotFoundException {
        Field[] fields = this.getClass().getDeclaredFields();
        System.out.println(fields);
        Class<?>[] classes = this.getClass().getInterfaces();
        for (Class klass : classes) {
            System.out.println(klass.getMethods());
        }
        this.getClass().getClassLoader();
        FileOutputStream fos = new FileOutputStream("hello.txt");
//        FilterInputStream fis = new FilterInputStream();  是正常类 不过构造函数是protected
    }
}

class A {
    public static int a;
    public static void print() {
        System.out.println("A: a=" + a);
    }
}

class B extends Father {
    public static int a = 2;
//    public static void print() {
//        System.out.println("B: a=" + a);
//    }
}
