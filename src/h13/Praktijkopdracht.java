package h13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 29/11/2017.
 */
public class Praktijkopdracht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        boom(g, 10);
    }


    void boom(Graphics g, int aantalbomen) {

        int x1, y1, x2, y2;

        x1 = 100;
        y1 = 100;
        x2 = 80;
        y2 = 60;
        int einderij = 4;

        for (int i = 0; i < aantalbomen; i++) {
            x1 += 100;
            x2 += 100;

            g.setColor(Color.black);
            g.fillRect(x1, y1, 30, 100);
            g.setColor(Color.green);
            g.fillArc(x2, y2, 70, 70, 360, 360);

            if (i == einderij) {
                y1 += 180;
                y2 += 180;
                x1 = 100;
                x2 = 80;
                einderij += 5;
            }
        }
    }
}
