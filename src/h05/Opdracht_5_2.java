package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 30-11-2016.
 */
public class Opdracht_5_2 extends Applet {

        int valerie;
        int jeroen;
        int hans;
        int base;
        int a10 = 10;
        int a20 = 20;
        int a30 = 30;
        int a40 = 40;
        int a50 = 50;
        int a60 = 60;
        int a70 = 70;
        int a80 = 80;
        int a90 = 90;
        int a100 = 100;

    @Override
    public void init() {
        //gewichten
        valerie = 40;
        jeroen = 100;
        hans = 80;
        //berekening
        base = 320;
    }

    @Override
    public void paint(Graphics g) {

        //ylijn
        g.drawLine(60, 20, 60, 320 );

        //xlijn
        g.drawLine(60, 320, 400, 320 );

        //getallen
        g.drawString("00", 40, 320 );
        g.drawLine(40, 320, 60, 320 );
        g.drawString("20", 40, 259 );
        g.drawLine(40, 260, 60, 260 );
        g.drawString("40", 40, 199 );
        g.drawLine(40, 200, 60, 200 );
        g.drawString("60", 40, 139 );
        g.drawLine(40, 140, 60, 140 );
        g.drawString("80", 40, 79 );
        g.drawLine(40, 80, 60, 80 );
        g.drawString("100", 40, 19 );
        g.drawLine(40, 20, 60, 20 );

        //Auto tabellen (change int)
        g.drawString("Valerie", 90,360 );
        g.setColor(Color.yellow);
        g.fillRect(60,base - valerie * 3, 100, valerie * 3);

        g.setColor(Color.black);
        g.drawString("Jeroen", 190, 360 );
        g.setColor(Color.blue);
        g.fillRect(160,base - jeroen * 3, 100, jeroen * 3);

        g.setColor (Color.black);
        g.drawString("Hans", 290, 360 );
        g.setColor(Color.red);
        g.fillRect(260,base - hans * 3, 100, hans * 3);
    }

}
