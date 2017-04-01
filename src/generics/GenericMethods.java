package generics;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
//        gm.f(null);
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(true);
        gm.f(1D);
        gm.f(1L);
        gm.f(1f);
        gm.f(new GenericMethods());
        gm.f(int.class);
    }
}
