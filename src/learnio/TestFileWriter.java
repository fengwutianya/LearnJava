package learnio;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by xuan on 16-3-15.
 */
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("/home/xuan/hello.txt");
            for (int i = 0; i < 65536; i++) {
                fw.write(i);
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file write error");
            System.exit(-1);
        }
    }
}
