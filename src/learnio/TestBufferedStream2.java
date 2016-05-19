package learnio;

import java.io.*;

/**
 * Created by xuan on 16-3-15.
 */
public class TestBufferedStream2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("/home/xuan/TestBufferedStream2_in.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("/home/xuan/TestBufferedStream2_out.txt")
            );
            String s = null;
            for (int i = 0; i < 100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s=br.readLine()) != null) {
                System.out.println(s);
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
