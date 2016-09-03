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

        ByteBuffer buf = ByteBuffer.allocate(48);       //分配

        int bytesRead = inChannel.read(buf);            //读
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();                                 //翻转

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }

            buf.clear();                                //清理
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
