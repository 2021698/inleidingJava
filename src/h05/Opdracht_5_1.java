package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 16-11-2016.
 */
public class Opdracht_5_1 extends Applet {

    int width = 320;
    int height = 20;
    int breedte = 360;
    int hoogte = 40;
    int x = 700;
    int y = 220;
    int cirkel = 0;
    int getBreedte = 0;
    int getHoogte = 150;
    int getGetBreedte = 0;
    int getGetHoogte = 0;
    int round = 15;
    int g1 = 45;
    int g2 = 45;
    int g3 = 0;
    int g4 = 360;

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(height,height,width,height);

        g.drawRect(height, hoogte, width, getHoogte);

        g.drawRoundRect(height,y,width,getHoogte,round,round);

        g.fillRect(breedte, hoogte, width, getHoogte);
        g.drawArc(breedte, hoogte, width, getHoogte, g3, g4);

        g.fillArc(breedte, y, width, getHoogte, g3, g4);

        g.fillArc(breedte, x, width, getHoogte, g3, g4);
        g.drawArc(breedte, x, width, getHoogte, g1, g2);

        g.drawArc(breedte, x, width, getHoogte, g3, g4);

    }
}
