package h09;

import java.awt.*;
import java.applet.*;

/**
 * Created by Rik van Beek on 13-12-2016.
 */
public class Opdracht_9_1 extends Applet{

    public void init() {}


    public void paint(Graphics g) {
        g.drawString("" + 8 + " is groter dan " + 5 + ": " + (8 > 5), 50, 60 );
        g.drawString("" + 8 + " is kleiner dan " + 5 + ": " + (8 < 5), 50, 80 );
    }
}