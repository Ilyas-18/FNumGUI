package GUI_02;

import javax.swing.*;

public class GUI_Rahmen_02 {

    private JPanel panelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rahmen_02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new GUI_Rahmen_02().panelMain);
    }

    public GUI_Rahmen_02() {
    }
}
