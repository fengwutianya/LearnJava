package designPatterns.proxy.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xuan on 2017/8/7 0007.
 */
public class CGlibProxy implements MethodInterceptor {
    private void before() {
        System.out.println("before");
    }
    private void after() {
        System.out.println("after");
    }
    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    public static void main(String[] args) {
        CGlibProxy cGlibProxy = new CGlibProxy();
        HelloWorld helloWorld = cGlibProxy.getProxy(HelloWorld.class);
        helloWorld.sayHello();
        helloWorld.sayWorld();
    }
}

class HelloWorld {
    public void sayHello() {
        System.out.println("hello");
    }

    public void sayWorld() {
        System.out.println("world");
    }
}
