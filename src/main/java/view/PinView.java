package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinView extends JFrame {

    private JTextField currentPinField;
    private JTextField newPinField;

    private JButton confirmButton;

    public PinView() {
        // Setările cadru
        setTitle("Schimbare PIN");
        setSize(400, 200); // Ajustat dimensiunile
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crearea componentelor
        JLabel currentPinLabel = new JLabel("Current PIN:");
        JLabel newPinLabel = new JLabel("New PIN:");

        currentPinField = new JTextField(10);
        newPinField = new JTextField(10);

        confirmButton = new JButton("Confirm");


        // Setarea layout-ului cu BorderLayout pentru a centra butonul în partea de jos
        setLayout(new BorderLayout(10, 10));

        // Panel pentru a avea o zonă de layout fixă în mijloc
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        centerPanel.add(currentPinLabel);
        centerPanel.add(currentPinField);
        centerPanel.add(newPinLabel);
        centerPanel.add(newPinField);

        // Adăugarea panel-ului în partea de sus a frame-ului
        add(centerPanel, BorderLayout.CENTER);
        // Adăugarea butonului în partea de jos, centrându-l
        add(confirmButton, BorderLayout.SOUTH);
    }

    public void addConfirmButtonListener(ActionListener actionListener) {
        this.confirmButton.addActionListener(actionListener);
    }
    public String getCurrentPin(){
        return currentPinField.getText();
    }
    public String getNewPin(){
        return newPinField.getText();
}
}