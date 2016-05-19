package learnio;
import java.io.*;

/**
 * Created by xuan on 16-5-16.
 */
public class TestPrintStream2 {
    public static void main(String[] args) {
        String filename = "/home/xuan/log.txt";
        if (filename != null) {
            list(filename, System.out);
        }
    }
    public static void list(String filename, PrintStream fs) {
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(filename));
            String s;
            while ((s=br.readLine()) != null) {
                fs.println(s);
            }

        } catch (IOException e) {
            fs.println("cannot read the file");
        }
    }
}
