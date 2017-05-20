package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by usmannoor on 20/05/2017.
 */
public class Inventory {
    public JPanel inventory_panel;
    private JButton addProductsButton;
    private JButton findProductsButton;


    public Inventory() {

        addProductsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame add_pro = new JFrame("Inventory Management");
                add_pro.setContentPane(new Add_products().product_add);
                add_pro.pack();
                add_pro.setSize(500, 400);
                add_pro.setVisible(true);
            }
        });

        findProductsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame find_pro = new JFrame("Inventory Management");
                find_pro.setContentPane(new Find_products().products_find);
                find_pro.pack();
                find_pro.setSize(500, 400);
                find_pro.setVisible(true);
            }
        });
    }
}
