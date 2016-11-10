package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_4_4 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(60, 20, 60, 340 );
        g.drawLine(60, 340, 400, 340 );
        g.drawRect(60, 220, 100, 120 );
        g.drawRect(160, 40, 100, 300 );
        g.drawRect(260, 100, 100, 240 );
    }
}
