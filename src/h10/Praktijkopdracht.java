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
    String a, tekst;

    int invoer;
    double gemiddelde;
    double totaal;
    double aantalcijfers;

    @Override
    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label();
        knop = new Button();
        tekst = "";
        add(label);
        add(tekstvak);
        add(knop);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst + invoer, 50,50);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            invoer = Integer.parseInt(a);
            switch (invoer) {
                case 1:
                    tekst = "Cijfer is slecht ";
                    break;
                case 2:
                    tekst = "Cijfer is slecht ";
                    break;
                case 3:
                    tekst = "Cijfer is slecht ";
                    break;
                case 4:
                    tekst = "Cijfer is een onvoldoende ";
                    break;
                case 5:
                    tekst = "Cijfer is matig ";
                    break;
                case 6:
                    tekst = "Cijfer is een voldoende ";
                    break;
                case 7:
                    tekst = "Cijfer is een voldoende ";
                    break;
                case 8:
                    tekst = "Cijfer is een goed ";
                    break;
                case 9:
                    tekst = "Cijfer is een goed ";
                    break;
                case 10:
                    tekst = "Cijfer is een goed ";
                    break;
            }
            repaint();
        }
    }
}
