package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 23-1-2017.
 */
public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;

    double invoer;
    double gemiddelde;
    double totaal;
    double aantalcijfers;

    @Override
    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label();
        knop = new Button();
        add(label);
        add(tekstvak);
        add(knop);

    }

    @Override
    public void paint(Graphics g) {
        if (invoer < 3.1) {
            g.drawString("Cijfer is slecht ", 50, 50);
        }
        if (invoer > 4 && invoer < 5) {
            g.drawString("Cijfer is onvoldoende ", 50, 50);
        }
        if (invoer > 5 && invoer < 6) {
            g.drawString("Cijfer is matig", 50, 50);
        }
        if (invoer > 6 && invoer < 8) {
            g.drawString("Cijfer is goed",50,50);
        }
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = tekstvak.getText();
            invoer = Double.parseDouble(a);

            totaal += invoer;
            aantalcijfers ++;

            gemiddelde = totaal / aantalcijfers;
        }
    }
}
