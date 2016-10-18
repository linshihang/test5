package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ASUS on 2016/7/10.
 */
public class JFrameTest {
    public static void main(String[]args) {
        JFrame jFrame = new JFrame("Hello");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Button1");

        jFrame.add(BorderLayout.NORTH,button);
        jFrame.add(BorderLayout.CENTER,new Button("Button2"));
        jFrame.add(BorderLayout.CENTER,new Button("Button3"));
        jFrame.add(BorderLayout.NORTH,new Button("Button4"));
        jFrame.setSize(200, 300);
        jFrame.setVisible(true);

    }
}
