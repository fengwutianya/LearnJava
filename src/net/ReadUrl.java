package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xuan on 2017/8/31 0031.
 */
public class ReadUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream is = url.openStream();
        while (is.available() > 0) {
            System.out.print((char)is.read());
        }
        is.close();
    }
}
