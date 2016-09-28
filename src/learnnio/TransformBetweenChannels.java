package learnnio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * Created by xuan on 16-9-28.
 */
public class TransformBetweenChannels {
    public static void main(String[] args) throws IOException {
        RandomAccessFile fromFile =
                new RandomAccessFile("fromFile.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile =
                new RandomAccessFile("toFile.txt", "rw");
        FileChannel toChannel = toFile.getChannel();

        long position = 0;
        long count = toChannel.size();

        toChannel.transferFrom(fromChannel, position, count);
        fromChannel.close();
        toChannel.close();
        fromFile.close();
        toFile.close();
    }
}
