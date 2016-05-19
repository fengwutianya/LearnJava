package learnio;

import java.io.File;
import java.util.regex.Pattern;
/**
 * Created by xuan on 16-3-17.
 */
public class MyFilterTree {
    public static void showAllFiles(String path, String regex) {
        File root = new File(path);
        File[] files = root.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                showAllFiles(file.getAbsolutePath(), regex);
            else if(file.isFile()) {
                Pattern pattern = Pattern.compile(regex);
                if (pattern.matcher(file.getName()).matches())
                    System.out.println(file.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        showAllFiles(".", "[A-za-z]+.java");
    }
}
