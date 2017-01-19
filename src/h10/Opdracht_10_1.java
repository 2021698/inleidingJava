package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 5-1-2017.
 */
public class Opdracht_10_1 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    double oud;
    double hoogste = 0;
    double invoer;
    Button knop;
    @Override
    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("getal");
        knop = new Button("knop");
        tekstvak.addActionListener(new TekstvakListerner());
        knop.addActionListener(new TekstvakListerner());
        tekst = "";
        add(label);
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + hoogste,50,50);
        g.drawString("" + oud,50,80);
    }

    class TekstvakListerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            invoer = Double.parseDouble(s);
            if (invoer > hoogste) {
                hoogste = invoer;
            }
            oud = invoer;
            repaint();
        }
    }
}
