package learnio;

import learnio.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by xuan on 16-10-21.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream dis = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read(
                                    "/home/xuan/hello.css"
                            ).getBytes()
                    )
            );
            while (true) {
                System.out.print((char) dis.readByte());
            }
        } catch (EOFException e) {
            System.out.println("end of stream");
        }
    }
}
