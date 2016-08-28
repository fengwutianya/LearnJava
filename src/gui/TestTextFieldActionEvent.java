package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xuan on 2016/8/5 0005.
 */
public class TestTextFieldActionEvent {
    public static void main(String[] args) {
        new TFFrame();
    }
}

class TFFrame extends Frame {
    TFFrame () {
        TextField textField = new TextField();
        add(textField);
        textField.addActionListener(new TFActionListener());
        pack();
        setVisible(true);
    }
}

class TFActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField)e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}
