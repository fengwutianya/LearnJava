package learnio;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
/**
 * Created by xuan on 16-3-21.
 */
public class TestInputStreamReader {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        try {
            while ((s=bufferedReader.readLine()) != null && !s.equalsIgnoreCase("exit")) {
                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
