package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 1-2-2017.
 */
public class Praktijkopdracht extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;
    int getal2 = 0;
    public void init() {
    label = new Label("Voer een getal van 1 tot en met 10 in");
    tekstvak = new TextField("Getal");
    knop = new Button("OK");
    tekstvak.addActionListener(new TekstvakListener());
    knop.addActionListener(new TekstvakListener());
    add(label);
    add(tekstvak);
    add(knop);
    }

    @Override
    public void paint(Graphics g) {
        int getal1  = 0;

        int antwoordt;
        int x = 20;
        for(int teller = 0; teller < 10; teller++) {
            x += 20;
            getal1 ++;
            antwoordt = getal1 * getal2;
            g.drawString(getal1 + "x" + getal2 + " = " + antwoordt,20,x);
        }
    }
    class TekstvakListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String p = tekstvak.getText();
            getal2 = Integer.parseInt(p);
            repaint();
        }
    }
}
