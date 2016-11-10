package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_4_2 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawRect(20, 200, 600, 600 );
        g.drawLine(20, 200, 320, 20 );
        g.drawLine(320, 20, 620, 200 );
        g.drawRect(40, 300, 200, 200 );
        g.drawRect(50, 310, 85, 85 );
        g.drawRect(145, 310, 85, 85 );
        g.drawRect(50, 405, 85, 85 );
        g.drawRect(145, 405, 85, 85 );
        g.drawRect(300, 300, 250, 500 );
    }
}
