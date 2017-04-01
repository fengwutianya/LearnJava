package generics;

import generics.coffee.Generator;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class Fibonacci implements Generator<Integer> {
    private int count;
    private int curr = 0;
    public Fibonacci(int count) {
        this.count = count;
    }
    private int fibonacci(int num) {
        if (num < 2) return 1;
        else
            return fibonacci(num-1) + fibonacci(num-2);
    }
    @Override
    public Integer next() {
        if (curr++ < count) {
            return fibonacci(curr-1);
        }
        return null;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(6);
        System.out.println(fibonacci.next());
        System.out.println(fibonacci.next());
        System.out.println(fibonacci.next());
        System.out.println(fibonacci.next());
        System.out.println(fibonacci.next());
        System.out.println(fibonacci.next());
    }
}
