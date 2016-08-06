package wechat;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatClient extends Frame{
    TextField textField = new TextField();
    TextArea textArea = new TextArea();

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }

    public void launchFrame() {
        setLocation(800, 600);
        setSize(600, 600);
        add(textField, BorderLayout.SOUTH);
        add(textArea, BorderLayout.NORTH);
        setVisible(true);
    }
}
