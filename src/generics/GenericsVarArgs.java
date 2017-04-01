package generics;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class GenericsVarArgs {
    public <T> void print(T... args) {
        for (T item: args) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        new GenericsVarArgs().print(1, true, "hello");
    }
}
