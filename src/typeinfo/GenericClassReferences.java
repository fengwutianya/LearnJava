package typeinfo;

/**
 * Created by xuan on 2016/8/27 0027.
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = Double.class;   //wrong
    }
}
