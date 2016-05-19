package learnio;
import java.io.*;

/**
 * Created by xuan on 16-3-17.
 */
public class TestTransForm1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream("/home/xuan/hello.java")
            );
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(
                    new FileOutputStream("/home/xuan/hello.java"), "ISO8859_1"
            );
            osw.write("//it's used to test programs that you write.");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
