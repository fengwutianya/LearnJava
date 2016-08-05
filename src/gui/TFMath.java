package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xuan on 2016/8/5 0005.
 */
public class TFMath {
    public static void main(String[] args) {
        new TextFrame().launchFrame();
    }
}

class TextFrame extends Frame {
    TextField num1, num2, num3;
    public void launchFrame() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Label lbPlus = new Label("+");
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new TxtFrmListener());
        setLayout(new FlowLayout());
        add(num1);
        add(lbPlus);
        add(num2);
        add(btnEqual);
        add(num3);
        pack();
        setVisible(true);
    }
    class TxtFrmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(String.valueOf(n1+n2));

        }
    }
}


