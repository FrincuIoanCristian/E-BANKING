package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SendMoneyView extends JFrame {

    private JTextField amountField;
    private JTextField recipientPhoneNumberField;
    private JPasswordField pinField;
    private JButton sendButton;

    public SendMoneyView() {
        // Setările cadru
        setTitle("Send Money");
        setSize(400, 200); // Ajustat dimensiunile
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crearea componentelor
        JLabel amountLabel = new JLabel("Amount:");
        JLabel recipientPhoneNumberLabel = new JLabel("Recipient Phone Number:");
        JLabel pinLabel = new JLabel("PIN:");

        amountField = new JTextField(10);
        recipientPhoneNumberField = new JTextField(10);
        pinField = new JPasswordField(10);
        sendButton = new JButton("Send");

        // Setarea layout-ului cu BorderLayout pentru a centra butonul în partea de jos
        setLayout(new BorderLayout(10, 10));

        // Panel pentru a avea o zonă de layout fixă în mijloc
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        centerPanel.add(amountLabel);
        centerPanel.add(amountField);
        centerPanel.add(recipientPhoneNumberLabel);
        centerPanel.add(recipientPhoneNumberField);
        centerPanel.add(pinLabel);
        centerPanel.add(pinField);

        // Adăugarea panel-ului în partea de sus a frame-ului
        add(centerPanel, BorderLayout.CENTER);

        // Panel pentru a include butonul Send cu un spațiu între el
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(sendButton);

        // Adăugarea panel-ului de butoane în partea de jos, centrându-l
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addSendListener(ActionListener actionListener) {
        this.sendButton.addActionListener(actionListener);
    }

    public String getPhone(){
        return recipientPhoneNumberField.getText();
    }
    public double getAmount(){
        return Double.parseDouble(amountField.getText());
    }

    public String getPin(){
        // Note: In a real-world scenario, you may want to handle password securely.
        // Avoid storing passwords in plain text.
        char[] passwordChars = pinField.getPassword();
        return new String(passwordChars);
}
}