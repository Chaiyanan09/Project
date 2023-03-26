package src;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MyFrame
 */
public class MyFrame implements ActionListener {
    JFrame frame;
    JButton mybutton = new JButton("Padthai");
    JButton mybutton2 = new JButton("Tom Yum Koung");
    JButton mybutton3 = new JButton("Somtum");
    JButton mybutton4 = new JButton("green curry");
    JButton mybutton5 = new JButton("fried basil");
    JButton mybutton6 = new JButton("Chicken Massaman Curry");

    JLabel label1, label2;
    ImageIcon bgicon, thailogo;

    MyFrame() {
        ImageIcon thailogo = new ImageIcon(getClass().getResource("thai.png"));

        // Label********

        JLabel label1 = new JLabel();
        label1.setText("Menu Guide");
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(new Color(000000));
        label1.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label1.setIcon(thailogo);

        JFrame frame = new JFrame();
        frame.setTitle("Thai Cooking Guide");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setVisible(true);

        // JButton mybutton = new JButton("Padthai");
        mybutton.setBounds(140, 300, 100, 40);
        mybutton.addActionListener(this);
        mybutton.setFocusable(false);
        // mybutton.setHorizontalAlignment(JButton.CENTER);
        // mybutton.setFont(new Font("MV Boli", Font.PLAIN, 20));

        mybutton2.setBounds(313, 300, 150, 40);
        mybutton2.setFocusable(false);
        mybutton2.addActionListener(this);

        mybutton3.setBounds(535, 300, 100, 40);
        mybutton3.setFocusable(false);
        mybutton3.addActionListener(this);

        mybutton4.setBounds(140, 620, 100, 40);
        mybutton4.setFocusable(false);
        mybutton4.addActionListener(this);

        mybutton5.setBounds(336, 620, 100, 40);
        mybutton5.setFocusable(false);
        mybutton5.addActionListener(this);

        mybutton6.setBounds(490, 620, 200, 40);
        mybutton6.setFocusable(false);
        mybutton6.addActionListener(this);

        frame.add(mybutton);
        frame.add(mybutton2);
        frame.add(mybutton3);
        frame.add(mybutton4);
        frame.add(mybutton5);
        frame.add(mybutton6);
        frame.add(label1);

        try {
            bgicon = new ImageIcon(getClass().getResource("screen.png"));
            label2 = new JLabel(bgicon);
            frame.add(label2);
        } catch (Exception e) {
            System.out.println("null");
        }
        frame.setSize(800, 800);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mybutton) {
            Window1 newwindow = new Window1();
        }
        if (e.getSource() == mybutton2) {
            Window2 newwindow2 = new Window2();
        }
        if (e.getSource() == mybutton3) {
            Window3 newwindow3 = new Window3();
        }
        if (e.getSource() == mybutton4) {
            Window4 newwindow4 = new Window4();
        }
        if (e.getSource() == mybutton5) {
            Window5 newwindow5 = new Window5();
        }
        if (e.getSource() == mybutton6) {
            Window6 newwindow6 = new Window6();
        }

    }

}