package typeinfo;

/**
 * 类里面的static {}在该类第一次被加载时执行
 * Created by xuan on 2016/8/27 0027.
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After creating Gum");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
