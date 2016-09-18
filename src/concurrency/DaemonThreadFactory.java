package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by xuan on 16-9-18.
 */
public class DaemonThreadFactory implements ThreadFactory{
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
