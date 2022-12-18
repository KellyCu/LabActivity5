package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField tfYear;
    private JButton checkBtn;

    public LeapYearGUI(){

        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String LeapYear = tfYear.getText();
                try {
                    int getLeapYear = (Integer.parseInt(LeapYear));
                    boolean isLeapYear = (getLeapYear %4 == 0 && getLeapYear %100 != 0 || getLeapYear %400 == 0);

                    if(isLeapYear){
                        JOptionPane.showMessageDialog(mainPanel, "Leap Year");
                    }
                    else {
                        JOptionPane.showMessageDialog(mainPanel, "Not a Leap Year");
                    }
                }
                catch (NumberFormatException i){
                    JOptionPane.showMessageDialog(mainPanel,"Invalid input");
                }
            }
        });
    }

    public static void main(String[] args){
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.mainPanel);
        app.setLocationRelativeTo(null);
        app.setSize(400,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
