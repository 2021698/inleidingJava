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
    int cirkel = 785;
    int getBreedte = 0;
    int getHoogte = 150;
    int getGetBreedte = 0;
    int getGetHoogte = 0;
    int round = 30;
    int g1 = 0;
    int g2 = 45;
    int g3 = 0;
    int g4 = 360;

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        //line
        g.drawLine(height,height,width,height);
        //rechthoek
        g.drawRect(height, hoogte, width, getHoogte);
        //afgeronde rechthoek
        g.drawRoundRect(height,y,width,getHoogte,round,round);
        //gevulde rechthoek met ovaal
        g.setColor(new Color(255, 0, 255));
        g.fillRect(breedte, hoogte, width, getHoogte);
        g.setColor(Color.black);
        g.drawArc(breedte, hoogte, width, getHoogte, g3, g4);
        //gevulde ovaal
        g.setColor(new Color(255, 0, 255));
        g.fillArc(breedte, y, width, getHoogte, g3, g4);
        //taartpunt met ovaal eromheen
        g.setColor (Color.black);
        g.drawArc(x, hoogte, width, getHoogte, g3, g4);
        g.setColor(new Color(225, 0, 255));
        g.fillArc(x, hoogte, width, getHoogte, g1, g2);
        //cirkel
        g.setColor (Color.black);
        g.drawArc(cirkel, y, getHoogte, getHoogte, g4, g4);

    }
}
