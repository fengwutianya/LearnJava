package learnio;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by xuan on 16-3-16.
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("/home/xuan");
        String[] paths = file.list();
        Arrays.sort(paths, String.CASE_INSENSITIVE_ORDER);
        for (String path : paths)
            System.out.println(path);
        String[] paths2 = file.list(new MyFilenameFilter("[A-Za-z]+.java"));
        for (String path : paths2) {
            System.out.println(path);
        }
    }
}

class MyFilenameFilter implements FilenameFilter {
    private Pattern pattern;

    public MyFilenameFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}