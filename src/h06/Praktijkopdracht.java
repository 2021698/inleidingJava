package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 7-12-2016.
 */
public class Praktijkopdracht extends Applet{
    double a;
    double b;
    double c;
    double totaal;
    double eind;
    double aa;
    int bb;
    @Override
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        totaal = a + b + c;
        eind = (totaal / 3) * 10;
        bb = (int) eind;
        aa = (double) bb / 10;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + aa, 20, 20);
    }

}
