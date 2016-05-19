package learnio;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

/**
 * Created by xuan on 16-3-17.
 */
public class TestIsRr {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("/home/xuan/hello.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = "";
        while ((text=bufferedReader.readLine()) != null) {
            System.out.println(text);
        }

        System.out.println("-----------------------------");

        int tmp = -1;
        FileInputStream fileInputStream = new FileInputStream("/home/xuan/hello.java");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        while ((tmp=bufferedInputStream.read()) != -1) {
            System.out.print((char)tmp);
        }
    }
}
