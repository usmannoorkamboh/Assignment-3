package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class delete_user {
    public JPanel user_del;
    private JButton deleteUserButton;
    private JTextField username;


    public delete_user() {

        deleteUserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //TO DO
                //Delete User

                JOptionPane.showMessageDialog(null, "User Deleted!");
            }
        });
    }
}
