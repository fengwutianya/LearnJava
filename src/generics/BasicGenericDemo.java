package generics;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class BasicGenericDemo {
    public static void main(String[] args) {
        BasicGenerator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 8; i++) {
            System.out.println(gen.next());
        }
    }
}
