package designPatterns.proxy.staticProxy;

/**
 * Created by xuan on 2017/8/7 0007.
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println(name);
    }
}
