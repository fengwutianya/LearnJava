package http;

import java.io.*;
import java.net.Socket;

/**
 * Created by xuan on 16-10-21.
 */
public class TestHTTP {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.baidu.com", 80);
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        s.getOutputStream()
                )
        );
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        s.getInputStream()
                )
        );
        bw.write("GET / HTTP/1.1");
        bw.newLine();
        bw.write("HOST: www.baidu.com");
        bw.newLine();
        bw.write("Content-Type: text/html");
        bw.newLine();
        bw.newLine();
        bw.flush();

        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        bw.close();
        br.close();
        s.close();

    }
}
