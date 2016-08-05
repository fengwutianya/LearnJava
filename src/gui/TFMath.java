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
    public void launchFrame() {
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(10);
        Label lbPlus = new Label("+");
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new TxtFrmListener(num1, num2, num3));
        setLayout(new FlowLayout());
        add(num1);
        add(lbPlus);
        add(num2);
        add(btnEqual);
        add(num3);
        pack();
        setVisible(true);
    }
}

class TxtFrmListener implements ActionListener {
    TextField num1, num2, num3;

    TxtFrmListener(TextField num1, TextField num2, TextField num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        num3.setText(String.valueOf(n1+n2));

    }
}
