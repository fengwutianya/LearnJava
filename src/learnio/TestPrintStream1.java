package learnio;
import java.io.*;

/**
 * Created by xuan on 16-5-16.
 */
public class TestPrintStream1 {
    public static void main(String[] args) {
        PrintStream ps = null;  //PrintStream no exception
        try {
            FileOutputStream fos =
                    new FileOutputStream("/home/xuan/log.txt");
            ps = new PrintStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (ps != null) {
            System.setOut(ps);
        }
        int ln = 0;
        for (char c = 0; c <= 1000; c++) {
            System.out.print(c + " ");
            if (ln++ >= 100) {
                System.out.println();
                ln = 0;
            }
        }
    }
}
