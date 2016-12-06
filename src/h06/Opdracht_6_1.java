package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 6-12-2016.
 */
public class Opdracht_6_1 extends Applet {
    int personen;
    int opbrengst;
    int uitkomst;
    @Override
    public void init() {
        personen = 4;
        opbrengst = 113;
        uitkomst = opbrengst / personen;
    }

    @Override
    public void paint(Graphics g) {
        //jan
        g.drawString("opbrengst Jan: €" + uitkomst, 20, 40);
        //ali
        g.drawString("opbrengst Ali: €" + uitkomst, 20, 60);
        //jeannette
        g.drawString("opbrengst Jeannettel: €" + uitkomst, 20, 80);
        //rik
        g.drawString("opbrengst Rik: €" + uitkomst, 20, 100);
        //opbrengst
        g.drawString("Totaal: €113 ", 20, 120);
    }
}
