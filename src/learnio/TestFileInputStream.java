package learnio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by xuan on 16-3-15.
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileReader in = null;
        try {
            in = new FileReader("/home/xuan/IdeaProjects/LearnJava/src/learnio/TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("cannot find the file");
            System.exit(-1);
        }

        try {
            long num = 0;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("read " + num + " bytes in total.");
        } catch (IOException e) {
            System.out.println("cannot read the file.");
            System.exit(-1);
        }
    }
}
//中文

