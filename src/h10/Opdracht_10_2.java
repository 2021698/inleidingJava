package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
     * Created by Rik van Beek on 5-1-2017.
     */
    public class Opdracht_10_2 extends Applet {
        TextField tekstvak;
        Label label;
        String s, tekst;
        double oud;
        double hoogste;
        double invoer;
        double laagste;
        Button knop;

        @Override
        public void init() {
            hoogste = Double.MIN_VALUE;
            laagste = Double.MAX_VALUE;
            tekstvak = new TextField("", 20);
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
            if (hoogste == Double.MIN_VALUE) {}
            else {
                g.drawString("hoogste " + hoogste, 50, 50);
            }
            if (oud == 0) {}
            else {
                g.drawString("recent " + oud, 50, 80);
            }
            if (laagste == Double.MAX_VALUE) {}
            else {
                g.drawString("laagste " + laagste, 50, 110);
            }
        }

        class TekstvakListerner implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                invoer = Double.parseDouble(s);
                if (invoer > hoogste) {
                    hoogste = invoer;
                }
                if (invoer < laagste) {
                    laagste = invoer;
                }
                oud = invoer;
                repaint();
            }
        }
    }

