package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 21-4-2017.
 */
public class Opdracht_12_6 extends Applet {
    boolean gevonden;
    TextField tekstvak;
    Button knop;
    int[] getallen = {10,20,30,40,50,60,70,80,90,100,10,30,50,70,90,10,40,50,70,80,90,100};
    int aantal;

    public void init() {
        gevonden = false;
        tekstvak = new TextField();
        knop = new Button("OK");
        add(tekstvak);
        add(knop);

        knop.addActionListener(new TextvakListener());
        tekstvak.addActionListener(new TextvakListener());
    }

    @Override
    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("De waarde is " + aantal + " keer gevonden.", 50, 50);
        } else {
            g.drawString("De waarde is niet gevonden.", 50, 50);
        }
    }

    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int gezocht = Integer.parseInt(s);

            int teller = 0;
            aantal = 0;
            while (teller < getallen.length) {
                if (getallen[teller] == gezocht) {
                    gevonden = true;
                }
                if (getallen[teller] == gezocht) {
                    aantal += 1;
                }
                teller++;
            }
            repaint();
        }
    }
}
