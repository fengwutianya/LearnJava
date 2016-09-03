/**
 * Created by xuan on 2016/9/3.
 */
public class InitialOrder {
    public static void main(String[] args) {
        new InitDemo();
    }
}

class InitDemo {
    public InitDemo() {
        System.out.println("\u6784\u9020\u65b9\u6cd5");
    }

    {
        System.out.println("\u6784\u9020\u5757");
    }

    static {
        System.out.println("\u9759\u6001\u5757");
    }
}
/*
*output
* C:\Java\jdk1.8.0_65\bin\java -Didea.launcher.port=7537 "-Didea.launcher.bin.path=D:\JetBrains\IntelliJ IDEA 14.1.4\bin" -Dfile.encoding=GBK -classpath "C:\Java\jdk1.8.0_65\jre\lib\charsets.jar;C:\Java\jdk1.8.0_65\jre\lib\deploy.jar;C:\Java\jdk1.8.0_65\jre\lib\javaws.jar;C:\Java\jdk1.8.0_65\jre\lib\jce.jar;C:\Java\jdk1.8.0_65\jre\lib\jfr.jar;C:\Java\jdk1.8.0_65\jre\lib\jfxswt.jar;C:\Java\jdk1.8.0_65\jre\lib\jsse.jar;C:\Java\jdk1.8.0_65\jre\lib\management-agent.jar;C:\Java\jdk1.8.0_65\jre\lib\plugin.jar;C:\Java\jdk1.8.0_65\jre\lib\resources.jar;C:\Java\jdk1.8.0_65\jre\lib\rt.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\access-bridge-64.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\cldrdata.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\dnsns.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\jaccess.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\jfxrt.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\localedata.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\nashorn.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\sunec.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\sunjce_provider.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\sunmscapi.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\sunpkcs11.jar;C:\Java\jdk1.8.0_65\jre\lib\ext\zipfs.jar;D:\IdeaProjects\LearnJava\out\production\LearnJava;D:\JetBrains\IntelliJ IDEA 14.1.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain InitialOrder
静态块
构造块
构造方法
 */
