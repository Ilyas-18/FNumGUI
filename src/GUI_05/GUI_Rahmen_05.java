package GUI_05;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_05 extends javax.swing.JFrame {
        private JPanel panelMain;

        private Font f1 = new Font("Kefa", Font.BOLD, 20);
        private Font f2 = new Font("Tahoma", Font.BOLD, 12);
        private Font fGraph = new Font("New Times Roman", Font.PLAIN, 5);
        private int sizeX;
        private int sizeY;

        public static void main(String[] args) {
            GUI_05.GUI_Rahmen_05 frame = new GUI_05.GUI_Rahmen_05();
            frame.setPreferredSize(new Dimension(600,500));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setContentPane(new GUI_05.GUI_Rahmen_05().panelMain);
        }

        public void paint(Graphics g) {
        /* unverfälschte Methode paintComponent() aufrufen, um nicht Funktionalität zu verlieren,
         sonst z.B. Hindergrund weiss*/
            super.paintComponents(g);

            // zum variieren der Breite und Höhe
            sizeX = this.getWidth();
            sizeY = this.getHeight();

            // oben links soll Name stehen
            g.setColor(Color.cyan);
            g.setFont(f1);
            g.drawString(" Ilyas Arouna ", 50, 70);

            // Mittelpunkt einkreisen
            g.setColor(Color.pink);
            g.drawString(".< die Mitte!: ", 300, 270);
            g.fillOval(295, 265, 10, 10);

            // Koordinatenkreuz zeichnen
            g.setColor(Color.black);
            g.drawLine(10, sizeY / 2 + 20, sizeX, sizeY / 2 + 20); //x-Achse: Warum nicht sizeY/2
            g.drawLine(sizeX / 2, 40, sizeX / 2, sizeY); //y-Achse

            // Beschriftung der Achsen
            g.setFont(f2);
            g.drawString("x", sizeX - 20, sizeY / 2 + 20); //Bezeichnung
            for (int i = -10; i <= 10; i++) {
                if (i != 0) {
                    // sizeX/12 = 50 --> alle 50 Pixel
                    g.drawString("|" + i, sizeX / 2 + i * sizeX / 12, sizeY / 2 + 10 + 20);
                }
            }

            g.drawString("y", sizeX / 2 + 15, 50); //Bezeichnung
            for (int i = 10; i >= -10; i--) {
                if (i != 0) {
                    // sizeX/12 = 50 --> alle 50 Pixel
                    g.drawString("-" + i, sizeX / 2, ((-i * sizeX / 12) + sizeY / 2 + 20));
                }
            }

            // Der Graph einer Funktion wird gezeichnet
            g.setFont(fGraph);
            for (double x = -5; x <= 5; x = x + 0.001) {
                double y = x * x - 1;
                g.drawString(".", sizeX / 2 + (int) (x * sizeX / 12), sizeY / 2 + 20 - (int) (y * sizeX / 12));
            }
        }

        public GUI_Rahmen_05() {
        }
    }
