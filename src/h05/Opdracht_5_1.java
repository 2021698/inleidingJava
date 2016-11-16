package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 16-11-2016.
 */
public class Opdracht_5_1 extends Applet {

    int width = 320;
    int height = 20;
    int breedte = 0;
    int hoogte = 40;
    int x = 0;
    int y = 220;
    int cirkel = 0;
    int getBreedte = 0;
    int getHoogte = 150;
    int getGetBreedte = 0;
    int getGetHoogte = 0;
    int round = 15;

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(height,height,width,height);

        g.drawRect(height, hoogte, width, getHoogte);

        g.drawRoundRect(height,y,width,getHoogte,round,round);

        g.fillRect();
        g.drawArc();

        g.fillArc();

        g.fillArc();
        g.drawArc();

        g.drawArc();

    }
}
