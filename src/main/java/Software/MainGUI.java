package Software;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI implements ActionListener {
        JFrame frame;
        JTextField textField;
        JButton[] numberButtons = new JButton[10];
        JButton[] funcButtons = new JButton[8];
        JButton addButton;
        JButton subButton;
        JButton multButton;
        JButton divButton;
        JButton decButton;
        JButton equButton;
        JButton delButton;
        JButton clrButton;
        JPanel panel;
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        char operator;

    public void drawingFrame(){
            frame = new JFrame();
            frame.setSize(350, 550);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);

            textField = new JTextField();
            textField.setBounds(50,25,250,50);
            textField.setEnabled(false);

            frame.add(textField);
            frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
