package src;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window3 {
    JFrame frame = new JFrame();
    ImageIcon bgicon;
    JLabel label2;

    Window3() {

        frame.setTitle("Thai Cooking Guide");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setVisible(true);

        try {
            bgicon = new ImageIcon(getClass().getResource("somtum.png"));
            label2 = new JLabel(bgicon);
            frame.add(label2);
        } catch (Exception e) {
            System.out.println("null");
        }
        frame.setSize(800, 800);
        frame.setVisible(true);

    }
}
