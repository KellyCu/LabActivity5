package FoodOrdering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FoodOrderGUI extends JFrame{
    private JPanel mainPanel;
    private JCheckBox cbPizza;
    private JRadioButton rbNone;
    private JButton orderButton;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private double total = 0;




    public FoodOrderGUI(){

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbPizza.isSelected()){
                    total += 100;
                }
                if(cbBurger.isSelected()){
                    total += 80;
                }
                if(cbFries.isSelected()){
                    total += 65;
                }
                if(cbSoftDrinks.isSelected()){
                    total += 55;
                }
                if(cbTea.isSelected()){
                    total += 50;
                }
                if(cbSundae.isSelected()){
                    total += 40;
                }

                if(rbNone.isSelected()){
                    JOptionPane.showMessageDialog(mainPanel, "The total price is Php " + total);
                    int move = JOptionPane.showConfirmDialog(mainPanel, "Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (move == JOptionPane.CLOSED_OPTION || move == JOptionPane.YES_OPTION) {
                        total = 0;
                    }
                    return;
                }
                else if (rb5.isSelected()){
                    total = total -(total * 0.5);
                }
                else if (rb10.isSelected()){
                    total = total - (total * 0.10);
                }
                else if (rb15.isSelected()){
                    total = total - (total * 0.15);
                }
                JOptionPane.showMessageDialog(mainPanel, "The total price is Php "+ total);
                int move = JOptionPane.showConfirmDialog(mainPanel, "Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (move == JOptionPane.CLOSED_OPTION || move == JOptionPane.YES_OPTION) {
                    total = 0;
                }
            }
        });


    }
    
    public static void main(String[] args){
        FoodOrderGUI frame = new FoodOrderGUI();
        frame.setTitle("Food Ordering System");
        frame.setContentPane(frame.mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
