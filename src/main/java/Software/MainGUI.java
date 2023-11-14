package Software;

import javax.swing.*;
import java.awt.*;
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
            frame.setSize(400, 550);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);

            textField = new JTextField();
            textField.setBounds(50,25,280,50);
            textField.setEnabled(false);

            addButton = new JButton("+");
            subButton = new JButton("-");
            multButton = new JButton("*");
            divButton = new JButton("/");
            decButton = new JButton(".");
            equButton = new JButton("=");
            delButton = new JButton("delete");
            clrButton = new JButton("clear");

            //adding functions buttons to functions array
            funcButtons[0] = addButton;
            funcButtons[1] = subButton;
            funcButtons[2] = multButton;
            funcButtons[3] = divButton;
            funcButtons[4] = decButton;
            funcButtons[5] = equButton;
            funcButtons[6] = delButton;
            funcButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,450,100,30);
        clrButton.setBounds(200, 450,100,30);

        panel = new JPanel();
        panel.setBounds(50, 100, 280,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multButton);
        panel.add(decButton);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
