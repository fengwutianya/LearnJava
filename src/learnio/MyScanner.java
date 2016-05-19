package learnio;

import java.util.Scanner;

/**
 * Created by xuan on 16-5-8.
 */
public class MyScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the string :");
        while (true) {
            String line = s.nextLine();
            if (line.equals("exit")) break;
            System.out.println(">>>" + line);
        }
    }
}
