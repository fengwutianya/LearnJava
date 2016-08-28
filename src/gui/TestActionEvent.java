package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xuan on 2016/8/5 0005.
 */

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame("Test");
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");
        button2.setActionCommand("game over");
        Monitor monitor = new Monitor();
        button1.addActionListener(monitor);
        button2.addActionListener(monitor);
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

class Monitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
