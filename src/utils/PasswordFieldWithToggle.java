package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFieldWithToggle extends JPanel {
    private JPasswordField passwordField;
    private JButton toggleButton;
    private boolean isPasswordVisible;

    public PasswordFieldWithToggle(int columns) {
        passwordField = new JPasswordField(columns);
        toggleButton = new JButton("Show");
        isPasswordVisible = false;

        setLayout(new BorderLayout());
        add(passwordField, BorderLayout.CENTER);
        add(toggleButton, BorderLayout.EAST);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                togglePasswordVisibility();
            }
        });
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    private void togglePasswordVisibility() {
        if (isPasswordVisible) {
            passwordField.setEchoChar('•');
            toggleButton.setText("Show");
        } else {
            passwordField.setEchoChar((char) 0);
            toggleButton.setText("Hide");
        }
        isPasswordVisible = !isPasswordVisible;
    }
}
