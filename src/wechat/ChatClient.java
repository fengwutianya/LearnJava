package wechat;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatClient extends Frame{
    TextField textField = new TextField();
    TextArea textArea = new TextArea();
    Socket s;

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }

    public void launchFrame() {
        setLocation(800, 600);
        setSize(600, 600);
        add(textField, BorderLayout.SOUTH);
        add(textArea, BorderLayout.NORTH);
        pack();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
        textField.addActionListener(new TxtfldListener());
        setVisible(true);
        connect();
    }

    public void connect() {
        try {
            s = new Socket("127.0.0.1", 8888);
            System.out.println("connected.");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private class TxtfldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String string = textField.getText().trim();
            textArea.setText(string);
            textField.setText("");
            try {
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF(string);
                dos.flush();
                dos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
