package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class Manager extends JFrame {
    private JButton manageUsersButton;
    public JPanel manager_panel;
    private JButton manageSalesButton;
    private JButton manageInventoryButton;
    private JButton salesReportingButton;


    public Manager() {

        manageSalesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sal = new JFrame("Sales");
                sal.setContentPane(new Sales().sales_panel);
                sal.pack();
                sal.setSize(500, 400);
                sal.setVisible(true);

            }
        });

        manageUsersButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame usr = new JFrame("Users");
                usr.setContentPane(new Users().users_panel);
                usr.pack();
                usr.setSize(500, 400);
                usr.setVisible(true);

            }
        });

        manageInventoryButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame inventory = new JFrame("Inventory");
                inventory.setContentPane(new Inventory().inventory_panel);
                inventory.pack();
                inventory.setSize(500, 400);
                inventory.setVisible(true);

            }
        });

        salesReportingButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame report = new JFrame("Sales");
                report.setContentPane(new Reports().reports);
                report.pack();
                report.setSize(500, 400);
                report.setVisible(true);

            }
        });
    }
}
