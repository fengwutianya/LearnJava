package effectiveJava.serialization;

import java.io.*;

/**
 * ObjectOutputStream writeObject Serializable transient serialVersionID
 * Created by xuan on 2017/8/29 0029.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello.txt"));
            Serialization serialization = new Serialization();
            serialization.setHello(1);
            serialization.setWorld(2);
            serialization.setQin(3);
            oos.writeObject(serialization);
            Serialization temp = new Serialization();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello.txt"));
            temp = (Serialization) ois.readObject();
            System.out.println("hello: " + temp.getHello() +
                "\nworld: " + temp.getWorld() +
                "\nqin: " + temp.getQin());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
