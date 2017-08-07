package package1;

/**
 * Created by xuan on 2017/7/26 0026.
 */
public class Father {
    protected void print() {
        System.out.println("hello world");
    }
    void sayHello() {
        System.out.println("hello world");
    }
}

class Son {
    public static void main(String[] args) {
        new Father().print();//protected 子类可访问，同一包也可以访问
        new Father().sayHello(); //default同一包可以访问 子类不能访问，所以还是default更严
    }
}
