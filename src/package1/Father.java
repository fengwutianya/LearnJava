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
        new Father().print();//protected ����ɷ��ʣ�ͬһ��Ҳ���Է���
        new Father().sayHello(); //defaultͬһ�����Է��� ���಻�ܷ��ʣ����Ի���default����
    }
}
