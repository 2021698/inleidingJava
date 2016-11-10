package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_4_3 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(90, 90, 10, 100 );
        g.drawRect(100, 100, 160, 40 );
        g.drawRect(100, 140, 160, 40 );
        g.drawRect(100, 180, 160, 40 );
    }
}
