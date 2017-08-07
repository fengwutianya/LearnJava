import util.ClassUtil;

import java.io.File;
import java.net.URL;
import java.util.Set;

/**
 * Created by xuan on 2017/8/6 0006.
 */
public class TestUtil {
    public static void main(String[] args) {
        System.out.println(new File("util").exists());
        Set<Class<?>> classSet = ClassUtil.getClassSet("util");
        System.out.println(classSet.size());
        URL url = TestUtil.class.getClassLoader().getResource("jdbc.jar");
        System.out.println(url.getProtocol());

    }
}
