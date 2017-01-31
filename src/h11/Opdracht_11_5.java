package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 27-1-2017.
 */
public class Opdracht_11_5 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;
        int x = 20;
        while(teller < 5) {
            y += 20;
            x += 20;
            g.drawRect(y,y,20,20);
            teller ++;
        }
    }
}
