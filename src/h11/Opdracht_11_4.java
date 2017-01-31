package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 27-1-2017.
 */
    public class Opdracht_11_4 extends Applet {
        @Override
        public void init() {

        }

        @Override
        public void paint(Graphics g) {
            int teller = 0;
            int getal1 = 0;
            int getal2 = 3;
            int totaal = 0;
            int y = 20;

            while(teller < 11) {
                y += 20;
                g.drawString("Getal " + totaal, 50, y);
                totaal = getal1 + getal2;
                getal1 = totaal;
                teller++;
            }
        }
    }

