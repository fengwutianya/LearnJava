package learnnio;


import java.io.RandomAccessFile;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.Buffer;

/**
 * Created by xuan on 2016/8/29.
 */
public class TestChannel {
    public static void main(String[] args) throws Exception{
        RandomAccessFile aFile =
                new RandomAccessFile("usedByJava.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(4);
        int bytesRead = -1;
        while ((bytesRead = inChannel.read(buf)) != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }
            System.out.println();

            buf.clear();
        }

        aFile.close();
    }
}
