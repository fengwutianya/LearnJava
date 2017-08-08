package designPatterns.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk�Ķ�̬���� ��Ҫ��дInvocationHandler��ʵ���࣬ʵ��invoke����
 * Ȼ��Proxy.newProxyInstance()���ɴ����࣬��������õ���invoke������invoke������method����
 * Object result = method.invoke(obj, args);��InvocationHandlerImpl����
 * jdk��̬����������ӿڵģ�����Ҳֻ����ǿ��תΪһ�����ӿڣ�����תΪobjʵ����
 * Created by xuan on 2017/8/9 0009.
 */
public class GenerateProxyForElectricCar {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();

        ClassLoader classLoader = electricCar.getClass().getClassLoader();

        Class[] interfaces = electricCar.getClass().getInterfaces();
//        Class[] interfaces = {Vehicle.class};

        InvocationHandler handler = new InvocationHandlerImpl(electricCar);    //���ô������ÿһ���������ǵ���InvocationHandler��invoke������
                                                                    //invoke������method���ã������ʵ�ֲ�ͬ��������

        //�Զ�����class�ļ����ڴ��У�Ҫ����classLoader��Ҫ��������з�����interfaces����ô����handler
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);    //����Ҫ�� ���ɴ�����
        Vehicle vehicle = (Vehicle) o;                                          //�����ൽ�ӿ�one of interfacesת����������Ӧ������ķ���
        vehicle.drive();
        Rechargable rechargable = (Rechargable) o;
        rechargable.recharge();
//        ElectricCar car = (ElectricCar) o; Ҳ���� ���� ElectricCar������зǽӿڷ�����������������û�����������
    }
}
