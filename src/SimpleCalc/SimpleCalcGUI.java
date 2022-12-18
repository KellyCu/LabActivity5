package SimpleCalc;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;


public class SimpleCalcGUI extends JFrame {
    private JTextField tfNumber1;
    private JLabel a2ndNumberLabel;
    private JLabel a1stNumberLabel;
    private JLabel lblResult;
    private JTextField tfNumber2;
    private JTextField tfResult;
    private JComboBox cbOperations;
    private JButton computeBtn;
    private JPanel mainPanel;

    public SimpleCalcGUI() {
        computeBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent i) {
                try {
                    String getFirstInt = tfNumber1.getText();
                    if(getFirstInt.isEmpty()){
                        throw new IllegalArgumentException();
                    }
                    String getSecInt = tfNumber2.getText();
                    if(getSecInt.isEmpty()){
                        throw new IllegalArgumentException();
                    }
                    String ope = (String) cbOperations.getSelectedItem();
                    int parseFInt = (Integer.parseInt(getFirstInt));
                    int parseSInt = (Integer.parseInt(getSecInt));
                    int result;

                    switch (Objects.requireNonNull(ope)) {
                        case "+":
                            result = parseFInt + parseSInt;
                            tfResult.setText(String.valueOf(result));
                            break;
                        case "-":
                            result = parseFInt - parseSInt;
                            tfResult.setText(String.valueOf(result));
                            break;
                        case "*":
                            result = parseFInt * parseSInt;
                            tfResult.setText(String.valueOf(result));
                            break;
                        case "/":
                            result = parseFInt / parseSInt;
                            tfResult.setText(String.valueOf(result));
                            break;
                    }
                }
                catch(ArithmeticException l){
                    JOptionPane.showMessageDialog(mainPanel,"Invalid Input!");
                }
                catch(IllegalArgumentException l){
                    JOptionPane.showMessageDialog(mainPanel, "No input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI frame = new SimpleCalcGUI();
        frame.setTitle("Simple Calculator");
        frame.setSize(700, 400);
        frame.setContentPane(frame.mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
