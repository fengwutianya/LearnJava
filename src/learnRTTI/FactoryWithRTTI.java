package learnRTTI;

/**
 * Created by xuan on 2016/9/2.
 */
public class FactoryWithRTTI {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("learnRTTI.Orange");
        f.eat();    //���ﶯ���˶�̬�󶨣��������õ������෽��
    }
}

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("eat Apple");
    }
}

class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("eat Orange");
    }
}

class Factory {
    //��������
    public static Fruit getInstance(String classname) {
        Fruit f = null;
        try {
            f = (Fruit)Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return f;
    }
}
