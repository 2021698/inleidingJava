package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 30-1-2017.
 */
public class Opdracht_11_6 extends Applet{

    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int y = 100;
        int x = 100;
        int width = 3;
        int height = 3;
        while(teller < 5) {
            y -= 7;
            x -= 7;
            width += 14;
            height += 14;
            g.drawArc(x,y,width,height,360,360);
            teller ++;
        }
    }
}
