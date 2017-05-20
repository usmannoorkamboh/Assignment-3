package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class Add_User {
    public JPanel add_user;
    private JButton addUserButton;
    private JTextField username;
    private JTextField position;
    private JTextField password;
    public Add_User() {

        addUserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //TO DO
                //Add User

                JOptionPane.showMessageDialog(null, "User Added!");
            }
        });
    }

}
