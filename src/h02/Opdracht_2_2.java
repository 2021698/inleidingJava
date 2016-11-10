package h02;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 4-11-2016.
 */
public class Opdracht_2_2 extends Applet {

    @Override
    public void init() {
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Rik", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Beek", 50, 70 );
    }
}
