package learnnio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;

/**
 * Created by xuan on 2016/8/29.
 */
public class TestChannel {
    public static void main(String[] args) throws Exception{
        RandomAccessFile aFile = new RandomAccessFile("D://usedByJava.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);       //����

        int bytesRead = inChannel.read(buf);            //��
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();                                 //��ת

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }

            buf.clear();                                //����
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
