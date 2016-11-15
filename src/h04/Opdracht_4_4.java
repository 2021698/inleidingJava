package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 10-11-2016.
 */
public class Opdracht_4_4 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(60, 20, 60, 340 );
        g.drawLine(60, 340, 400, 340 );
        g.drawString("Valerie", 90,360 );
        g.setColor(Color.yellow);
        g.fillRect(60, 220, 100, 120);
        g.drawRect(60, 220, 100, 120 );
        g.drawString("Jeroen", 190, 360 );
        g.setColor(Color.blue);
        g.fillRect(160, 40, 100, 300);
        g.drawRect(160, 40, 100, 300 );
        g.drawString("Hans", 290, 360 );
        g.setColor(Color.red);
        g.fillRect(260, 100, 100, 240);
        g.drawRect(260, 100, 100, 240 );
        g.drawString("00", 40, 340 );
        g.drawLine(40, 340, 60, 340 );
        g.drawString("20", 40, 279 );
        g.drawLine(40, 280, 60, 280 );
        g.drawString("40", 40, 219 );
        g.drawLine(40, 220, 60, 220 );
        g.drawString("60", 40, 159 );
        g.drawLine(40, 160, 60, 160 );
        g.drawString("80", 40, 99 );
        g.drawLine(40, 100, 60, 100 );
        g.drawString("100", 40, 39 );
        g.drawLine(40, 40, 60, 40 );
    }
}
