package javaConcurInPrac.ch02;

/**
 * ���룺��ȡ���Ĳ������������̣߳�
 * �̵߳��ø���synchronized����������������룬
 * ��ô���������
 * Created by xuan on 2016/10/8 0008.
 */
public class LoggingWidget extends Widget{
    @Override
    public synchronized void doSomething() {
        System.out.println(toString() + ": calling doSomething");
        super.doSomething();
    }
}


class Widget {
    public synchronized void doSomething() {

    }
}
