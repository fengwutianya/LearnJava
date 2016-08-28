package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuan on 2016/8/5 0005.
 */
public class MyMouseAdapter {
    public static void main(String[] args) {
        new MyFrame("paint");
    }
}

class MyFrame extends Frame {
    ArrayList<Point> points = null;
    public MyFrame(String s) {
        super(s);
        points = new ArrayList<Point>();
        setLayout(null);
        setBounds(300, 300, 400, 300);
        this.setBackground(new Color(200, 200, 250));
        setVisible(true);
        addMouseListener(new Monitor());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Iterator<Point> pointIterator = points.iterator();
        while (pointIterator.hasNext()) {
            Point point = pointIterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }
    public void addPoint(Point p) {
        points.add(p);
    }

    class Monitor extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame)e.getSource();
            myFrame.addPoint(new Point(e.getX(), e.getY()));
            myFrame.repaint();
        }
    }
}
