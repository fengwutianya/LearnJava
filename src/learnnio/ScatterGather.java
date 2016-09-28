package learnnio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by xuan on 16-9-28.
 */
public class ScatterGather {
    static void testScatter() throws IOException {
        RandomAccessFile aFile =
                new RandomAccessFile("usedByJava.txt", "rw");
        FileChannel outChannel = aFile.getChannel();

        ByteBuffer header = ByteBuffer.allocate(4);
        ByteBuffer body = ByteBuffer.allocate(5);

        ByteBuffer[] bufferArray = {header, body};

        outChannel.read(bufferArray);

        for (int i = 0; i < bufferArray.length; i++) {
            ByteBuffer buf = bufferArray[i];
            buf.flip();
            if (bufferArray[i] != null) {
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }
                System.out.println();
            }
        }
    }

    static void testGather() throws IOException {
        RandomAccessFile aFile =
                new RandomAccessFile("usedByJava.txt", "rw");
        FileChannel outChannel = aFile.getChannel();

        ByteBuffer header = ByteBuffer.allocate(40);
        ByteBuffer body = ByteBuffer.allocate(50);

        header.put((byte)33);
        header.put((byte)44);
        header.flip();
        body.put((byte)55);
        body.flip();

        ByteBuffer[] bufferArray = { header, body };
        outChannel.write(bufferArray);
    }

    public static void main(String[] args) throws IOException {
        testScatter();
        testGather();
    }
}
