package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 26-1-2017.
 */
public class Opdracht_11_2 extends Applet{
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int cijfer = 21;
        int y = 50;
        for(teller = 0; teller < 11; teller++) {
            cijfer -= 1;
            y += 20;
            g.drawString("Getal " + cijfer, 50, y);
        }
    }
}
