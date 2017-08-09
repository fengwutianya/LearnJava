package designPatterns.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by xuan on 2017/8/9 0009.
 */
public class CreateProxy {
    public static void main(String[] args) {
        MethodInterceptor interceptor = new Hacker();

        Enhancer enhancer = new Enhancer();         //enhancer需要target类和methodInterceptor，才能产生target子类的代理类，代理类里面有interceptor
                                                    //代理方法，表示代理逻辑
        enhancer.setSuperclass(Programmer.class);   //要代理的类
        enhancer.setCallback(interceptor);          //代理逻辑

        //产生代理类
        Programmer programmerProxy = (Programmer)enhancer.create();
        programmerProxy.code();
    }
}
