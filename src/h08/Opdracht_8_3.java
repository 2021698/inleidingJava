package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 9-12-2016.
 */
public class Opdracht_8_3 extends Applet {

    Button knop_ok;
    Label label;
    TextField tekstvak;
    double prijs;
    double prijsmetbtw;

    public void init() {
        knop_ok = new Button("OK");
            knop_ok.addActionListener(new KnopListenerok());
        tekstvak = new TextField("Prijs?", 20);
            tekstvak.addActionListener(new KnopListenertekst());
        label = new Label("bereken hier uw 21% BTW ");
        add(label);
        add(tekstvak);
        add(knop_ok);

    }

    public void paint(Graphics g) {
        g.drawString("Prijs icl 21% BTW " + prijsmetbtw,30,50);
    }

    class KnopListenerok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //p = prijs
            String p = tekstvak.getText();
            prijs = Double.parseDouble(p);
            prijsmetbtw = prijs * 1.21;
            repaint();
        }
    }

    class KnopListenertekst implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //p = prijs
            String p = tekstvak.getText();
            prijs = Double.parseDouble(p);
            prijsmetbtw = prijs * 1.21;
            repaint();
        }
    }
}
