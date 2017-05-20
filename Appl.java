package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 19/05/2017.
 */
public class Appl {
    private JButton logInButton;
    private JPanel panelMain;
    private JTextField username;
    private JPasswordField passwordField1;

    public Appl() {
        logInButton.addActionListener(new ActionListener() {

            public void make_invisible(JFrame frame) {
                frame.setVisible(false);
            }

            public boolean authenticate_user(String usrname, String password) {
                String uname = username.getText();
                String psd = passwordField1.getText();
                if (uname.equals(usrname) && (psd.equals(password))) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {

                boolean result = authenticate_user("usman", "usman");
                if (result) {
                    JOptionPane.showMessageDialog(null, "Login Successful");

                    JFrame man = new JFrame("Manager");
                    man.setContentPane(new Manager().manager_panel);
                    man.pack();
                    man.setSize(500, 400);
                    man.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
    }


    public static void main(String[] args) {

        JFrame login_frame = new JFrame("Home");
        login_frame.setContentPane(new Appl().panelMain);
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_frame.pack();
        login_frame.setSize(500, 400);
        login_frame.setVisible(true);
    }
}
