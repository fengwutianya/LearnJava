package javaConcurInPrac.ch02;

import net.jcip.annotations.NotThreadSafe;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by xuan on 2016/10/8 0008.
 */
@NotThreadSafe
public class UnsafeCountingFactorizer extends StatelessFactorizer {
    private long count = 0;

    public long getCount() {
        return count;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ++count;    //what makes it not thread-safe
        super.service(servletRequest, servletResponse);
    }
}
