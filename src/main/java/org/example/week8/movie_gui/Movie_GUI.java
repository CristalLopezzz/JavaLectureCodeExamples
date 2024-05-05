package org.example.week8.movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Movie_GUI extends JFrame {
    // Structure of GUI
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    // Contructor that initiates the GUI
    // Arranges the program information for functionality
    Movie_GUI() {
        // Sets mainPanel as contentpane
        setContentPane(mainPanel);
        // Preferred size
        setPreferredSize((new Dimension(400,300)));
        // Packs data so that it fits the preferred size
        pack();
        // Makes the window visible
        setVisible(true);
        // Closes the program when the window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        configureEventHandlers();

    }

    // Method that helps configure event handlers for the GUI structure and data
    private void configureEventHandlers() {
    // Modifies the slider
        ratingSlider.addChangeListener(new ChangeListener() {
                // Updates slider value
                @Override
                    public void stateChanged(ChangeEvent e) {
                        String valueLabelText = ratingSlider.getValue() + " stars";
                        sliderValueLabel.setText(valueLabelText);
                    // This updates movie opinion based on the rating given by user
                        updateOpinion();
                    }
                });
    // Modifies the checkbox
        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            // Update movie opinion based on checkbox value
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });
    // Modifies text field
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            // Updates movie opinion when text gets inserted
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            // Updates movie opinion when text is removed
            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        // Modifies quit button action
        quitButton.addActionListener(new ActionListener() {
            // When quit button gets clicked it will display the following message
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(Movie_GUI.this,
                        "Are you sure you want to quit?", "Quit",
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
    }

// Method that updates the movie opinion label based on the users input
    private void updateOpinion() {
        //Obtaining the movie name
        String movieName = movieTitleTextField.getText().strip();

        // If user does noy input movie name this will be displayed
        if(movieName.isEmpty()) {
            movieOpinionLabel.setText("Movie opinion");
            return;
        }
        // Rating from slider
        int rating = ratingSlider.getValue();
        // Checkbox value
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();
        // The message displayed based off from previous actions
        String template = "You rated %s %d stars. You %s see again";

        String seeAgainString = "would";
        if (!seeAgain) {
            seeAgainString = "would not";
        }

        String opinion = String.format(template, movieName, rating, seeAgainString);

        movieOpinionLabel.setText(opinion);

    }


}
