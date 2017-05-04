package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/**
 * Created by Rik van Beek on 21-4-2017.
 */
public class Opdracht_12_5 extends Applet {
    boolean gevonden;
    TextField tekstvak;
    Button knop;
    int[] getallen = {20,40,60,80,100};
    int gezocht;

    public void init() {
        gezocht = 0;
        gevonden = false;
        tekstvak = new TextField();
        knop = new Button("OK");
        add(tekstvak);
        add(knop);

        knop.addActionListener(new TextvakListener());
    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        int teller = 0;
        if (gevonden) {
            y += 20;
            g.drawString("De waarde is gevonden.", 50, y);
        } else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }

    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int getal = Integer.parseInt(s);
            gezocht = getal;

            int teller = 0;

            if (getallen[teller] == gezocht) {
                gevonden = true;
            }
            repaint();
        }
    }
}
