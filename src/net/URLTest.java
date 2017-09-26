package net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xuan on 2017/8/31 0031.
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        URL baidu = new URL("http://www.baidu.com:80/index.html?username=hello#test");
        String protocol = baidu.getProtocol();
        String host = baidu.getHost();
        int port = baidu.getPort();
        String path = baidu.getPath();
        String file = baidu.getFile();
        String ref = baidu.getRef();
        String query = baidu.getQuery();
        System.out.println("protocol: " + protocol);
        System.out.println("host: " + host);
        System.out.println("port: " + port);
        System.out.println("path: " + path);
        System.out.println("file: " + file);
        System.out.println("ref: " + ref);
        System.out.println("query " + query);
    }
}
