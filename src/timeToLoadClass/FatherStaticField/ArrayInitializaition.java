package timeToLoadClass.FatherStaticField;

/**
 * Created by xuan on 8/28/17.
 */
public class ArrayInitializaition {
    public static void main(String[] args) {
        Son[] array = new Son[10];
//        array[5] = new Son();
        /**
         * although son is null, static field or method still can be reached.
         */
        System.out.println(array[4].field);
        Son son = null;
        System.out.println(son.field);
        son.print();
    }
}
