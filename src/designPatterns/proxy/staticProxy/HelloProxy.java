package designPatterns.proxy.staticProxy;

/**
 * Created by xuan on 2017/8/7 0007.
 */
public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy(Hello hello) {
        this.hello = hello;
    }

    private void before() {
        System.out.println("before");
    }
    private void after() {
        System.out.println("after");
    }

    @Override
    public void say(String name) {
        before();
        hello.say("hello world");
        after();
    }
}
