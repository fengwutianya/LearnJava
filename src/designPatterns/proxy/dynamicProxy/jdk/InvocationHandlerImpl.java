package designPatterns.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xuan on 2017/8/9 0009.
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object result = method.invoke(car, args);
        after(method);
        return result;
    }

    private void after(Method method) {
        System.out.println("finish call " + method.getName() + " method");
    }

    private void before(Method method) {
        System.out.println("about to call " + method.getName() + " method");
    }
}
