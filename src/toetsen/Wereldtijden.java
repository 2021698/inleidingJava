package toetsen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 17-3-2017.
 */
public class Wereldtijden extends Applet {
        int invoer;

        boolean klik;

        TextField tekstvak;

    public void init() {
        Label label;
        label = new Label("Voer een uur in");
        add(label);
        tekstvak = new TextField("Hier");
        add(tekstvak);
        Button knop;
        knop = new Button("OK");
        KnopListener tekstvaklistener = new KnopListener();
        knop.addActionListener(tekstvaklistener);
        tekstvak.addActionListener(tekstvaklistener);
        add(knop);
    }

    public void paint(Graphics g) {
        int londen;
        int tokyo;
        int newyork;
        int sydney;

        int x = 50;
        int y = 60;
        if (klik) {
            londen = invoer -1;
            if (londen < 0) {
                londen = londen + 24;
            }
            tokyo = invoer + 7;
            if (tokyo > 24) {
                tokyo = tokyo - 24;
            }
            newyork = invoer - 6;
            if (newyork < 0) {
                newyork = newyork + 24;
            }
            sydney = invoer + 9;
            if (sydney > 24) {
                sydney = sydney - 24;
            }
            if (invoer < 0 || invoer > 24) {
                g.drawString("invoer niet geldig",x,y);
            }
            else {
                g.drawString("Tijd in Londen: " + londen + ":00",x,y);
                y += 20;
                g.drawString("Tijd in Tokyo: " + tokyo + ":00",x,y);
                y += 20;
                g.drawString("Tijd in New York: " + newyork + ":00",x,y);
                y += 20;
                g.drawString("Tijd in Sydney: " + sydney + ":00",x,y);
            }
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String tv;
            tv = tekstvak.getText();
            invoer = (int) Double.parseDouble(tv);

            klik = true;
            repaint();
        }
    }
}
