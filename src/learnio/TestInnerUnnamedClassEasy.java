package learnio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by xuan on 16-3-17.
 */
public class TestInnerUnnamedClassEasy {
    public static void main(String[] args) {
        File file = new File("/home/xuan");
        String[] paths = file.list();
        for (String path : paths) {
            System.out.println(path);
        }
        Arrays.sort(paths, String.CASE_INSENSITIVE_ORDER);
        System.out.println("--------------------------");
        final String regex = "[A-za-z]+.java";
        String[] paths2 = file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        for (String path : paths2) {
            System.out.println(path);
        }
    }
}
