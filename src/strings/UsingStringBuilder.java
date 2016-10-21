package strings;

import java.util.Random;
/**
 * StringBuilder类，常用构造方法
 * StringBuilder(), append(), delete(), toString()
 * Created by xuan on 16-10-21.
 */
public class UsingStringBuilder {
    public static Random random = new Random(47);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            sb.append(random.nextInt(100));
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");

        return sb.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
