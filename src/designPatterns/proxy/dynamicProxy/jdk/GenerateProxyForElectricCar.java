package designPatterns.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk的动态代理 需要编写InvocationHandler的实现类，实现invoke方法
 * 然后Proxy.newProxyInstance()生成代理类，代理类调用的是invoke方法，invoke方法有method参数
 * Object result = method.invoke(obj, args);在InvocationHandlerImpl里面
 * jdk动态代理是面向接口的，最终也只可以强制转为一个个接口，不能转为obj实现类
 * Created by xuan on 2017/8/9 0009.
 */
public class GenerateProxyForElectricCar {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();

        ClassLoader classLoader = electricCar.getClass().getClassLoader();

        Class[] interfaces = electricCar.getClass().getInterfaces();
//        Class[] interfaces = {Vehicle.class};

        InvocationHandler handler = new InvocationHandlerImpl(electricCar);    //调用代理类的每一个方法都是调用InvocationHandler的invoke方法，
                                                                    //invoke方法有method引用，因此能实现不同函数功能

        //自动生成class文件在内存中，要加载classLoader，要代理的所有方法在interfaces，怎么代理handler
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);    //最重要了 生成代理类
        Vehicle vehicle = (Vehicle) o;                                          //代理类到接口one of interfaces转化，调用相应被代理的方法
        vehicle.drive();
        Rechargable rechargable = (Rechargable) o;
        rechargable.recharge();
//        ElectricCar car = (ElectricCar) o; 也不能 试想 ElectricCar类如果有非接口方法，代理类里面是没有这个方法的
    }
}
