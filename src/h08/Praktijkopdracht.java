package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;


/**
 * Created by Rik van Beek on 10-12-2016.
 */
public class Praktijkopdracht extends Applet{

    Button knop_keer;
    Button knop_gedeelddoor;
    Button knop_plus;
    Button knop_min;
    TextField tekstvak1;
    TextField tekstvak2;
    double getal1;
    double getal2;
    double uitkomst;

    public void init() {
        knop_keer = new Button("*");
            knop_keer.addActionListener(new KnopListenerkeer());
        knop_gedeelddoor = new Button("/");
            knop_gedeelddoor.addActionListener(new KnopListenergedeelddoor());
        knop_plus = new Button("+");
            knop_plus.addActionListener(new KnopListenerplus());
        knop_min = new Button("-");
            knop_min.addActionListener(new KnopListenermin());
        tekstvak1 = new TextField("eerste getal");
        tekstvak2 = new TextField("tweede getal");
        add(tekstvak1);
        add(tekstvak2);
        add(knop_keer);
        add(knop_gedeelddoor);
        add(knop_plus);
        add(knop_min);
    }

    public void paint(Graphics g) {
        g.drawString("= " + uitkomst,42,50);
    }

    class KnopListenerkeer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //ophaal tekstvak1
            String a = tekstvak1.getText();
            getal1 = Double.parseDouble(a);
            //ophaal tekstvak2
            String aa = tekstvak2.getText();
            getal2 = Double.parseDouble(aa);

            uitkomst = getal1 * getal2;
            repaint();
        }
    }

    class KnopListenergedeelddoor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //ophaal tekstvak1
            String b = tekstvak1.getText();
            getal1 = Double.parseDouble(b);
            //ophaal tekstvak2
            String bb = tekstvak2.getText();
            getal2 = Double.parseDouble(bb);

            uitkomst = getal1 / getal2;
            repaint();
        }
    }

    class KnopListenerplus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //ophaal tekstvak1
            String c = tekstvak1.getText();
            getal1 = Double.parseDouble(c);
            //ophaal tekstvak2
            String cc = tekstvak2.getText();
            getal2 = Double.parseDouble(cc);

            uitkomst = getal1 + getal2;
            repaint();
        }
    }

    class KnopListenermin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //ophaal tekstvak1
            String d = tekstvak1.getText();
            getal1 = Double.parseDouble(d);
            //ophaal tekstvak2
            String dd = tekstvak2.getText();
            getal2 = Double.parseDouble(dd);

            uitkomst = getal1 - getal2;
            repaint();
        }
    }
}
