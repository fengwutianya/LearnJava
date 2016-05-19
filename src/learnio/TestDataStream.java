package learnio;

import java.io.*;

/**
 * Created by xuan on 16-3-21.
 */
public class TestDataStream {
    public static void main(String[] args) {
        String name;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

        try {
            dataOutputStream.writeDouble(0.77777777777777777777);
            dataOutputStream.writeBoolean(true);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
                    byteArrayOutputStream.toByteArray()
            );
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());

            System.out.println(byteArrayInputStream.available());
            dataInputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
