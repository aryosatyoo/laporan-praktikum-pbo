package p3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid1841720170Aryo extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    public Grid1841720170Aryo() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));

        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Grid Layout Demo");
    }

}
