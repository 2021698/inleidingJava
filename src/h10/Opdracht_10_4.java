package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 20-1-2017.
 */
public class Opdracht_10_4 extends Applet {
    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label labelmaand;
    Label labeljaar;
    Button knop;
    String a, tekstmaand;
    String b, tekstjaar;
    String februari;
    int maand;
    int jaar;

    public void init() {
        tekstvakmaand = new TextField("",20);
        tekstvakjaar = new TextField("",20);
        labelmaand = new Label("Type een maand ");
        labeljaar = new Label("Type een jaar");
        knop = new Button("OK");
        tekstvakmaand.addActionListener(new TekstvakListener());
        tekstvakjaar.addActionListener(new TekstvakListener());
        knop.addActionListener(new TekstvakListener());
        add(labelmaand);
        add(tekstvakmaand);
        add(labeljaar);
        add(tekstvakjaar);
        add(knop);


    }


    public void paint(Graphics g) {
        g.drawString(tekstmaand,60,80);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            b = tekstvakjaar.getText();
            jaar = Integer.parseInt(b);
            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
            jaar % 400 == 0) {
                februari = "29 dagen";
            }
            else {
                februari = "28 dagen";
            }

            a = tekstvakmaand.getText();
            maand = Integer.parseInt(a);
            switch (maand) {
                case 1:
                    tekstmaand = "Januari 31 dagen";
                    break;
                case 2:
                    tekstmaand = "Februari " + februari;
                    break;
                case 3:
                    tekstmaand = "Maart 31 dagen";
                    break;
                case 4:
                    tekstmaand = "April 30 dagen";
                    break;
                case 5:
                    tekstmaand = "Mei 31 dagen";
                    break;
                case 6:
                    tekstmaand = "Juni 30 dagen";
                    break;
                case 7:
                    tekstmaand = "Juli 31 dagen";
                    break;
                case 8:
                    tekstmaand = "Augustus 31 dagen";
                    break;
                case 9:
                    tekstmaand = "September 30 dagen";
                    break;
                case 10:
                    tekstmaand = "Oktober 31 dagen";
                    break;
                case 11:
                    tekstmaand = "November 30 dagen";
                    break;
                case 12:
                    tekstmaand = "December 31 dagen";
                    break;
                default:
                    tekstmaand = "Maand ongeldig!";
                    break;
            }
            repaint();
        }
    }
}
