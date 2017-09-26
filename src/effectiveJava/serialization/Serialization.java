package effectiveJava.serialization;

import java.io.Serializable;

/**
 * Created by xuan on 2017/8/29 0029.
 */
public class Serialization implements Serializable {
    public static final long serialVersionID = 1L;

    private int hello;
    private int world;
    private transient int qin;

    public int getHello() {
        return hello;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public int getQin() {
        return qin;
    }

    public void setQin(int qin) {
        this.qin = qin;
    }
}
