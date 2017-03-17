package h12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 14-2-2017.
 */
public class Opdracht_12_3 extends Applet {
    double Tekstvak[];
    TextField tekstvak[];

    public void init() {
        Tekstvak = new double[5];
        tekstvak = new TextField[5];

        for (int teller = 0; teller < Tekstvak.length; teller++) {
            Tekstvak[teller] = 5 * teller + 1;
            tekstvak[teller] = new TextField();
            add(tekstvak[teller]);
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < Tekstvak.length; teller ++) {

        }
        repaint();
    }
}
