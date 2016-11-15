package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 15-11-2016.
 */
public class Opdracht_4_7 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 50, 50, 15, 15);
        g.fillArc(30,30,10,10,360,360);
        g.fillArc(50,50,10,10,360,360);
        g.fillArc(30,50,10,10,360,360);
        g.fillArc(50,30,10,10,360,360);
    }
}
