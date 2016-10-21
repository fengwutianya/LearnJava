package learnio;

import learnio.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;
/**
 * Created by xuan on 16-10-21.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in = new StringReader(
                BufferedInputFile.read("" +
                        "/home/xuan/IdeaProjects/LearnJava/src/strings/MemoryInput.java")
        );
        int c;
        while ((c=in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
