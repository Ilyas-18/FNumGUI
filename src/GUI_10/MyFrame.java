package GUI_10;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends javax.swing.JFrame {

    private int sizeX; private int sizeY;
    private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);
    private Font fGraph = new Font("New Times Roman", Font.PLAIN, 5);
    private boolean jButtonZeichneIsSelected = false;

    public MyFrame() {
        setContentPane(new GUI_Rahmen_10(this).getPanelMain());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Funktionszeichner");
        pack(); setVisible(true);
    }
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); paint(g);

        // Ein Graph einer Funktion wird gezeichnet
        if (jButtonZeichneIsSelected) {
            g.setFont(fGraph);
            for (double x = -5; x <= 5; x = x + 0.001) {
                double y = x * x - 1;
                g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
            }
        }
    }
    public void setjButtonZeichnenIsSelected(boolean jButtonZeichneIsSelected) {
        this.jButtonZeichneIsSelected = jButtonZeichneIsSelected;
    }

}
