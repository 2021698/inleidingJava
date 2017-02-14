package h12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 6-2-2017.
 */
public class Opdracht_12_1 extends Applet {
    int salaris[];
    int gemiddelde = 0;
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        salaris = new int[10];

        salaris[0] = 10;
        salaris[1] = 20;
        salaris[2] = 30;
        salaris[3] = 40;
        salaris[4] = 50;
        salaris[5] = 60;
        salaris[6] = 70;
        salaris[7] = 80;
        salaris[8] = 90;
        salaris[9] = 100;

        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 20, 20 * teller + 20);
            gemiddelde += salaris[teller];
        }
        gemiddelde = gemiddelde / salaris.length;
        g.drawString("Gemiddelde: " + gemiddelde,50,100);
    }
}
