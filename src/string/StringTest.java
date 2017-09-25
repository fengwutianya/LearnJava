package string;

/**
 * Created by xuan on 2017/8/30 0030.
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "https://www.baidu.com:8888/index.html";
        System.out.println(str.matches("^https{0,1}://www\\.\\w{1,}\\.(com|cn|org)$"));
        /**
         * +表示前面至少一个
         * ()子表达式
         */
        System.out.println(str.matches("(\\w+)://([^/:]+)(:\\d*)?([^# ]*)"));

    }
}
