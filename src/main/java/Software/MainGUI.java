package Software;

import javax.swing.*;

public class MainGUI {
        JFrame frame;

    public void drawingFrame(){
            frame = new JFrame();
            frame.setSize(300, 450);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);
            frame.setVisible(true);
    }

}
