package GUI_03;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_03 extends javax.swing.JFrame {

    private JPanel panelMain;

    private Font f1 = new Font("Kefa", Font.BOLD, 20);

    public static void main(String[] args) {
        GUI_Rahmen_03 frame = new GUI_Rahmen_03();
        frame.setPreferredSize(new Dimension(600,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new GUI_Rahmen_03().panelMain);
    }

    public void paint(Graphics g) {
        /* unverfälschte Methode paintComponent() aufrufen, um nicht Funktionalität zu verlieren,
         sonst z.B. Hindergrund weiss*/
        super.paintComponents(g);

        // oben links soll Name stehen
        g.setColor(Color.green);
        g.setFont(f1);
        g.drawString(" Jürgi Elfers ", 50, 70);

        // Mittelpunkt einkreisen
        g.setColor(Color.red);
        g.drawString(".< Hier ist die Mitte!: ", 300, 270);
        g.fillOval(295, 265, 10, 10);

        // Koordinatenkreuz zeichnen
        g.setColor(Color.black);
        g.drawLine(10, 270, 600, 270); //x-Achse von x/y zu x2/y2
        g.drawLine(300, 40, 300, 500); //y-Achse
    }

    public GUI_Rahmen_03() {
    }
}
