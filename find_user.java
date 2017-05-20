package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class find_user {
    public JPanel usr_find;
    private JButton findUserButton;
    private JTextField username;
    private JTextArea textArea1;


    public find_user() {

        findUserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                textArea1.update(textArea1.getGraphics());
            }
        });
    }
}
