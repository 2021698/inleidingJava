package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 26-1-2017.
 */
public class Opdracht_11_3 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int getal1 = 1;
        int getal2 = 0;
        int totaal;
        int y = 20;

        while(teller < 10) {
            y += 20;
            totaal = getal2 + getal1;
            g.drawString("Getal " + totaal, 50, y);
            getal1 = getal2;
            getal2 = totaal;
            teller++;
        }
    }
}
