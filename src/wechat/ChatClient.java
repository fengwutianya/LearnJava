package wechat;

import java.awt.*;

/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatClient extends Frame{
    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }

    public void launchFrame() {
        setLocation(800, 600);
        setSize(600, 600);
        setVisible(true);
    }
}
