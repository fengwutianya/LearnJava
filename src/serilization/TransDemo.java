package serilization;

import java.io.*;

/**
 * Created by xuan on 4/11/17.
 */
class ClassLib implements Serializable {
    private int majorVersion;
    private int minorVersion;

    private transient InputStream is;

    public ClassLib(InputStream is) throws IOException {
        this.is = is;
        DataInputStream dis;
        dis = new DataInputStream(is);
        if (dis.readInt() != 0xcafebabe)
            throw new IOException("not a .class file");
        minorVersion = dis.readShort();
        majorVersion = dis.readShort();
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void showIS() {
        System.out.println(is);
    }
}

public class TransDemo {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("usage: java TransDemo classfile");
            return;
        }
        ClassLib cl = new ClassLib(new FileInputStream(args[0]));
        System.out.println("Minor: " + cl.getMinorVersion());
        System.out.println("Major: " + cl.getMajorVersion());
        cl.showIS();

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        "x.ser"
                )
        )) {
            oos.writeObject(cl);
        }
        cl = null;

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("x.ser")
        )) {
            System.out.println();
            cl = (ClassLib) ois.readObject();
            System.out.println("Minor: " + cl.getMinorVersion());
            System.out.println("Major: " + cl.getMajorVersion());
            cl.showIS();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
