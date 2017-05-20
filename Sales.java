package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class Sales extends JFrame {
    private JTextField product_name;
    private JButton add_product;
    private JButton checkoutButton;
    private JTextField total_amount;
    public JPanel sales_panel;
    private JTable sales_table;


    public Sales() {

        add_product.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // TO DO
                // Add items into table when add clicked
                JOptionPane.showMessageDialog(null, "Item Added");

            }
        });

        checkoutButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // TO DO
                // Checkout Operations
                JOptionPane.showMessageDialog(null, "Checkout Operations");

            }
        });
    }
}
