/**
 * Created by xuan on 2017/8/11 0011.
 */
public class BitOperation {
    public static void main(String[] args) {
        int i = 1 | 3;          //��λ��
        i = 1 & 3;              //��λ��
        i = 1 ^ 3;              //��λ���
        i = ~30;                //��λȡ��
        System.out.println(i);

        char a = 'a';
        int b = a;
        System.out.println(b);
        System.out.println(('a'^'b'^'c') == ('c'^'b'^'a'));
    }
}
