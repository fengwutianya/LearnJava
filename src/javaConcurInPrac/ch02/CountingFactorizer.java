package javaConcurInPrac.ch02;

import net.jcip.annotations.NotThreadSafe;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * java.util.concurrent.atomic原子性操作
 * Created by xuan on 2016/10/8 0008.
 */
@NotThreadSafe
public class CountingFactorizer extends StatelessFactorizer {
    private final AtomicLong count = new AtomicLong(0);

    public long getCount() { return count.get(); }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        count.incrementAndGet();
        super.service(servletRequest, servletResponse);
    }
}
