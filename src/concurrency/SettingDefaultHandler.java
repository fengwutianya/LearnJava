package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 系统首先检查有没有专有的线程异常处理器
 * 也就是上面专门设置的附着在线程上的异常处理器
 * 如果没有的话再调用defaultUncaughtExceptionHandler
 * Created by xuan on 16-9-18.
 */
public class SettingDefaultHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new MyUncaughtExceptionHandler()
        );
        ExecutorService exec =
                Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
