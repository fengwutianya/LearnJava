package learnio;
import java.io.*;
/**
 * Created by xuan on 16-4-15.
 */
public class TestByteArrayInputStream {
    public static void main(String[] args) {
        byte[] bytes = {1, 2 ,3, 4};
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        while (bis.available() != -1) System.out.println(bis.read());
    }
}
/*
output: a lot of -1, but why?
 */