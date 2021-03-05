package test;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
            JFrame frame = new JFrame("Hello");
            frame.setPreferredSize(new Dimension(200, 200));
            frame.add(new Board());
            frame.pack();
            frame.setVisible(true);
    }
}

