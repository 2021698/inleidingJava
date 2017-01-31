package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 31-1-2017.
 */
public class Opdracht_11_7 extends Applet{

    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int y = 250;
        int x = 250;
        int width = 5;
        int height = 5;
        while(teller < 50) {
            y -= 5;
            x -= 5;
            width += 10;
            height += 10;
            g.drawArc(x,y,width,height,360,360);
            teller ++;
        }
    }
}
