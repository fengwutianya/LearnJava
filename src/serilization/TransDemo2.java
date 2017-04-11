package serilization;

import java.io.*;

/**
 * Created by xuan on 4/11/17.
 */
public class TransDemo2 {
    public static void main(String[] args) {
//        Fool fool = new Fool();
//        System.out.println("w: " + fool.w);
//        System.out.println("x: " + fool.x);
//        System.out.println("y: " + fool.y);
//        System.out.println("z: " + fool.z);
//
//        try (FileOutputStream fos = new FileOutputStream("y.ser");
//                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            oos.writeObject(fool);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        fool = null;
//        System.out.println(fool);

        try (FileInputStream fis = new FileInputStream("y.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Fool fool = (Fool) ois.readObject();
            System.out.println("w: " + fool.w);
            System.out.println("x: " + fool.x);
            System.out.println("y: " + fool.y);
            System.out.println("z: " + fool.z);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Fool implements Serializable {
    int w;
    transient int x;
    transient static int y;
    int z;

    public Fool() {
        w = 1;
        x = 2;
        y = 3;
        z = 4;
    }
}
