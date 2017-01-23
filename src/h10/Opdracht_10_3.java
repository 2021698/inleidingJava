package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 20-1-2017.
 */
public class Opdracht_10_3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Type een maand ");
        knop = new Button("OK");
        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(knop);


    }


    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Februari 28 dagen";
                    break;
                case 3:
                    tekst = "Maart 31 dagen";
                    break;
                case 4:
                    tekst = "April 30 dagen";
                    break;
                case 5:
                    tekst = "Mei 31 dagen";
                    break;
                case 6:
                    tekst = "Juni 30 dagen";
                    break;
                case 7:
                    tekst = "Juli 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus 31 dagen";
                    break;
                case 9:
                    tekst = "September 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober 31 dagen";
                    break;
                case 11:
                    tekst = "November 30 dagen";
                    break;
                case 12:
                    tekst = "December 31 dagen";
                    break;
                default:
                    tekst = "Maand ongeldig!";
                    break;
            }
            repaint();
        }
    }
}
