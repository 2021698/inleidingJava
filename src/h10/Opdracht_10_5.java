package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 5-1-2017.
 */

public class Opdracht_10_5 extends Applet{
    TextField tekstvak;
    Button knop;

    double invoer;
    double gemiddelde;
    double totaal;
    double aantalcijfers;

    @Override
    public void init() {
        tekstvak = new TextField();
        knop = new Button();
        tekstvak.addActionListener(new KnopListener());
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        if (invoer <5.5){
            g.drawString("Cijfer is onvoldoende",50,50);
        }
        else {
            g.drawString("Cijfer is voldoende",50,50);
        }
        g.drawString("Gemiddelde is "+gemiddelde,50,60);
        if (gemiddelde > 5.5) {
            g.drawString("student geslaagd",50,70);
        }
        else {
            g.drawString("Student niet geslaagd",50,70);
        }
    }
    class KnopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = tekstvak.getText();
            invoer = Double.parseDouble(a);

            totaal += invoer;
            aantalcijfers ++;

            gemiddelde = totaal / aantalcijfers;
            repaint();
        }
    }
}
