package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 26-1-2017.
 */
public class Opdracht_11_1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(y, 50, y, 300);
        }
    }
}
