package typeinfo.toys;

/**
 * Class<FancyToy> ftClass, FancyToy ft = ftClass.newInstance() Right!
 * Class<? super FancyToy> up1 = ftClass.getSuperclass() Right! but
 * Class<Toy> up2 = ftClass.getSuperclass() Wrong! and
 * Toy toy = up1.newInstance(); Wrong!
 * Created by xuan on 2016/8/28 0028.
 */
public class GenericToyTest {
    public static void main(String[] args) {
        Class<FancyToy> ftClass = FancyToy.class;
        try {
            FancyToy ft = ftClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Class<? super FancyToy> up = ftClass.getSuperclass();
//        Class<Toy> up2 = ftClass.getSuperclass();wrong!wired.
        try {
            Object obj = up.newInstance();
//            Toy toy = up.newInstance();wrong!
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
