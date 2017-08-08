package designPatterns.proxy.dynamicProxy;

import designPatterns.proxy.staticProxy.Hello;
import designPatterns.proxy.staticProxy.HelloImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xuan on 2017/8/7 0007.
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }
    private void before() {
        System.out.println("before");
    }
    private void after() {
        System.out.println("after");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        //每次动态代理豆这么多参数比较恶心 而且是固定的，重构
//        Hello helloProxy = (Hello) Proxy.newProxyInstance(
//                hello.getClass().getClassLoader(),
//                hello.getClass().getInterfaces(),
//                dynamicProxy
//        );
        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.say("jack");
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }
}
