package learnio;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by xuan on 16-10-21.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("/home/xuan/hello.css")
                )
        );
        while (dis.available() != 0) {
            //System.out.println(dis.available());
            System.out.print((char)dis.readByte());
        }
    }
}
