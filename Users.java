package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class Users {
    public JPanel users_panel;
    private JButton deleteUsersButton;
    private JButton findUsersButton;
    private JButton addUsersButton;

    public Users() {

        addUsersButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame adduser = new JFrame("User Management");
                adduser.setContentPane(new Add_User().add_user);
                adduser.pack();
                adduser.setSize(500, 400);
                adduser.setVisible(true);

            }
        });

        deleteUsersButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame del_usr = new JFrame("User Management");
                del_usr.setContentPane(new delete_user().user_del);
                del_usr.pack();
                del_usr.setSize(500, 400);
                del_usr.setVisible(true);

            }
        });

        findUsersButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame adduser = new JFrame("User Management");
                adduser.setContentPane(new find_user().usr_find);
                adduser.pack();
                adduser.setSize(500, 400);
                adduser.setVisible(true);

            }
        });

    }


}
