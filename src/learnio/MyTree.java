package learnio;
import java.io.File;
/**
 * Created by xuan on 16-3-17.
 */
public class MyTree {
    public static void showAllFiles(String path) {
        File root = new File(path);
        File[] files = root.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                showAllFiles(file.getAbsolutePath());
            } else if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        showAllFiles(".");
    }
}
