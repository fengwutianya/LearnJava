package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n < 2) return n;
        int[] fib = new int[n+1];
        fib[0] = 0; fib[1] = 1;
        for (int i = 2; i < n+1; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.Fibonacci(1));
        System.out.println(fibonacci.Fibonacci(2));
        System.out.println(fibonacci.Fibonacci(3));
        System.out.println(fibonacci.Fibonacci(4));
        System.out.println(fibonacci.Fibonacci(5));
        System.out.println(fibonacci.Fibonacci(6));
    }
}
