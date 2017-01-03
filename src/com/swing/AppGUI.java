package com.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by GIOhnny on 27/12/2016.
 */
public class AppGUI {
    private JTextField txtUsername;
    private JButton btnLogin;
    private JPasswordField txtPassword;
    private JPanel panelMain;

    public AppGUI(){
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"LOGIN!");
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("intelliJ GUI");
        frame.setContentPane(new AppGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
