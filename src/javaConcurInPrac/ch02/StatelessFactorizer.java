package javaConcurInPrac.ch02;

import net.jcip.annotations.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * stateless object is thread-safe
 * every thread has its own runtime-stack, i is located
 * in its own stack, cannot be accessed by other threads
 * Created by xuan on 2016/10/8 0008.
 */
@ThreadSafe
public class StatelessFactorizer  extends GenericServlet{
    /**
     * 模拟因式分解
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = extractFromRequest(servletRequest);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(servletResponse, factors);
    }

    public void encodeIntoResponse(ServletResponse servletResponse, BigInteger[] factors) {
    }

    public BigInteger[] factor(BigInteger i) {
        return new BigInteger[] {i};
    }

    public BigInteger extractFromRequest(ServletRequest servletRequest) {
        return new BigInteger("7");
    }
}
