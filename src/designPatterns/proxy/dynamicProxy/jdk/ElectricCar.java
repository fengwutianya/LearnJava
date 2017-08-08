package designPatterns.proxy.dynamicProxy.jdk;

/**
 * Created by xuan on 2017/8/9 0009.
 */
public class ElectricCar implements Vehicle, Rechargable {
    @Override
    public void recharge() {
        System.out.println("recharge");
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
