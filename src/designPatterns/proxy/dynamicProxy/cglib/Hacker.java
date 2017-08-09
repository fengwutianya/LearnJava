package designPatterns.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现了方法拦截接口MethodInterceptor
 * Created by xuan on 2017/8/9 0009.
 */
public class Hacker implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);    //object, args
        after();
        return result;
    }

    private void after() {
        System.out.println("log: end");
    }

    private void before() {
        System.out.println("log: start");
    }
}
