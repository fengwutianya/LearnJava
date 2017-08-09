package designPatterns.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by xuan on 2017/8/9 0009.
 */
public class CreateProxy {
    public static void main(String[] args) {
        MethodInterceptor interceptor = new Hacker();

        Enhancer enhancer = new Enhancer();         //enhancer��Ҫtarget���methodInterceptor�����ܲ���target����Ĵ����࣬������������interceptor
                                                    //����������ʾ�����߼�
        enhancer.setSuperclass(Programmer.class);   //Ҫ�������
        enhancer.setCallback(interceptor);          //�����߼�

        //����������
        Programmer programmerProxy = (Programmer)enhancer.create();
        programmerProxy.code();
    }
}
