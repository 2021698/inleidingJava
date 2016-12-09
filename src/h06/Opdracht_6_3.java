package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 6-12-2016.
 */
public class Opdracht_6_3 extends Applet{

    int a;
    int b;
    int berekening1;
    int berekening2;
    int uitkomst;

    @Override
    public void init() {
        a = 5;
        b = 6;
        uitkomst = a - b;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("uitkomst " + uitkomst, 20, 20);
    }
}
