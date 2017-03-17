package toetsen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 17-3-2017.
 */
public class Wereldtijden extends Applet {
        //invoer = wat de gebruiker invoert
        int invoer;
        //boolean
        boolean klik;

        TextField tekstvak;

    public void init() {
        //Label Voer een uur in
        Label label;
        label = new Label("Voer een uur in");
        add(label);
        //TextField voor gebruiker
        tekstvak = new TextField("Hier");
        add(tekstvak);
        //Button om de ingevoerde tijd te bevestigen
        Button knop;
        knop = new Button("OK");
        add(knop);

        KnopListener tekstvaklistener = new KnopListener();
        knop.addActionListener(tekstvaklistener);
        tekstvak.addActionListener(tekstvaklistener);
    }

    public void paint(Graphics g) {
        //Integer variables
        int londen;
        int tokyo;
        int newyork;
        int sydney;
        //locatie van de tijd dat op beeld getoont wordt
        int x = 50;
        int y = 60;
        if (klik) {
            //Tijd Londen
            londen = invoer -1;
            if (londen < 0) {
                londen = londen + 24;
            }
            //Tijd Tokyo
            tokyo = invoer + 7;
            if (tokyo > 24) {
                tokyo = tokyo - 24;
            }
            //Tijd New York
            newyork = invoer - 6;
            if (newyork < 0) {
                newyork = newyork + 24;
            }
            //Tijd Sydney
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
