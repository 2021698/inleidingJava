package h02;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_2_1 extends Applet {

    @Override
    public void init() {
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Rik van Beek", 50, 50 );
    }
}
