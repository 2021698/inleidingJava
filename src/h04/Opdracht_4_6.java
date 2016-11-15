package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 15-11-2016.
 */
public class Opdracht_4_6 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.fillArc(100,100,200,200,360,360);
        g.fillRect(100,200,200,120);
        g.fillArc(100,220,200,200,360,360);
        g.setColor(Color.red);
        g.fillArc(150,150,100,100,360,360);
        g.setColor(Color.green);
        g.fillArc(150,270,100,100,360,360);
    }
}
