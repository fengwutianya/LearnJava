package javaConcurInPrac.ch02;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * �����̰߳�ȫ��ԭ�����ã�����Ժ���ھ�̬
 * Created by xuan on 2016/10/8 0008.
 */
public class UnsafeCachingFactorizer extends StatelessFactorizer {
    private final AtomicReference<BigInteger> lastNumber
            = new AtomicReference<>();
    private final AtomicReference<BigInteger[]> lastFactors
            = new AtomicReference<>();


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = extractFromRequest(servletRequest);
        if (i.equals(lastNumber.get())) {
            encodeIntoResponse(servletResponse, lastFactors.get());
        } else {
            BigInteger[] factors = factor(i);
            lastNumber.set(i);          //race
            lastFactors.set(factors);
            encodeIntoResponse(servletResponse, factors);
        }
    }
}
