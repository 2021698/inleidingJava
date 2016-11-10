package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_4_1 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50, 20, 30, 80 );
        g.drawLine(50, 20, 70, 80 );
        g.drawLine(30, 80, 70, 80 );
    }
}
