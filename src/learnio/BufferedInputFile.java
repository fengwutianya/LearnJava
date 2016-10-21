package learnio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by xuan on 16-10-21.
 */
public class BufferedInputFile {
    public static String read(String filename)
            throws IOException {
        BufferedReader in = new BufferedReader(     //缓冲流，readLine()方法
                new FileReader(filename)    //FileReader(), FileWriter()
        );
        String s;
        StringBuilder sb = new StringBuilder();     //StringBuilder
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");            //readLine()会删除换行符,append()
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        System.out.println(read("/home/xuan/IdeaProjects/LearnJava/src/learnio/BufferedInputFile.java"));
    }
}
