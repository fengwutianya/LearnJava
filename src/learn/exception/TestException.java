package learn.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by xuan on 16-3-19.
 */
public class TestException {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("/home/xuan/myfile.txt");
            int b;
            b = in.read();
            while (b != -1) {
                System.out.print(b);
                b = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
