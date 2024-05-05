package org.example.week8currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel currencyResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;
    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75 );
    // Constructor that will help arrange the program
    CurrencyConverter() {
        setContentPane((mainPanel));
        setPreferredSize(new Dimension(500,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // allows to click enter from keyboard instead of having to click the convert button with your mouse
        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        // Method that helps determine what happens when button is clicked
        convertButton.addActionListener((new ActionListener() {

            // Will help calculate the conversion of dollars to euros
            @Override
            public void actionPerformed(ActionEvent e) {
                // Helps identify what was typed in the JTextField dollarsTextField
                String dollarString = dollarsTextField.getText();

                try {
                    // Converts the string of dollars to double value
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);
                    // Calculates the conversion
                    double convertedValue = dollars * exchangeRate;
                    // Displays final message to user showing their final conversion result
                    String resultString = String.format("%.2f dollars is equivalent to %.2f euros", dollars,
                            convertedValue, toCurrency);
                    currencyResultLabel.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        }));
    }
}
