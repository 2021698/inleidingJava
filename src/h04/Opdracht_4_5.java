package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 15-11-2016.
 */
public class Opdracht_4_5 extends Applet {
    @Override
    public void init() {
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(100,100,200,200,360,360);
        g.setColor(Color.yellow);
        g.fillArc(100,100,200,200,90,90);
    }
}
