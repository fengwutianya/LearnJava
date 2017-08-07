/**
 * Created by xuan on 2017/7/26 0026.
 */
public class FibTest {
    public static void main(String[] args) {
        long x = fib(30);
        System.out.println(x);
        System.out.println(3.14);
        System.out.println("hello");
        System.out.println("h%20ello".replaceAll("%20", " "));
    }
    private static long fib(long n) {
        if (n < 2) return 1;
        return fib(n-1) + fib(n-2);
    }
}
