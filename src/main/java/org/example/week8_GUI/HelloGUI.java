package org.example.week8_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    // Constructor that help arrange data in the GUI
    HelloGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500,500)); // Changes height
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // This method directs the program what to do when users click on the buttons
        clickMeButton.addActionListener(new ActionListener() {
           // When the user clicks the button the following text will be displayed
            @Override
            public void actionPerformed(ActionEvent e) {

                myFirstLabel.setText("Hello GUI!");
            }
        });

    }
}
