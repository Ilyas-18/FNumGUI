package GUI_04;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_04 extends javax.swing.JFrame {
    private JPanel panelMain;

    private Font f1 = new Font("Kefa", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);

    public static void main(String[] args) {
        GUI_Rahmen_04 frame = new GUI_Rahmen_04();
        frame.setPreferredSize(new Dimension(600,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new GUI_Rahmen_04().panelMain);
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

        // Beschriftung der Achsen
        g.setFont(f2);
        g.drawString("x", 580, 290); //Bezeichnung
        for (int i = -5; i <= 5; i++) {
            String str = String.valueOf(i);
            if (i != 0) {
                g.drawString("|" + str, 298 + i * 50, 280);
            }
        }

        g.drawString("y", 290, 60); //Bezeichnung
        for (int i = 4; i >= -4; i--) {
            if (i != 0) {
                g.drawString("-" + i, 300, ((-i * 50) + 280));
            }
        }
    }

    public GUI_Rahmen_04() {
    }
}
