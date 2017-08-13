/**
 * Created by xuan on 2017/8/11 0011.
 */
public class BitOperation {
    public static void main(String[] args) {
        int i = 1 | 3;          //按位或
        i = 1 & 3;              //按位与
        i = 1 ^ 3;              //按位异或
        i = ~30;                //按位取反
        System.out.println(i);

        char a = 'a';
        int b = a;
        System.out.println(b);
        System.out.println(('a'^'b'^'c') == ('c'^'b'^'a'));
    }
}
