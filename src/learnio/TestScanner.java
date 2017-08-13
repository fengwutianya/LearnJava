package learnio;

import java.util.Scanner;

/**
 * Created by xuan on 2017/8/11 0011.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            }
            while (scanner.hasNextDouble()) {
                double j = scanner.nextDouble();
                System.out.println(j);
            }
        }
    }
}
