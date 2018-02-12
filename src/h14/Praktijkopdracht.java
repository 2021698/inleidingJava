package h14;

import java.applet.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.net.URL;

/**
 * Created by Rik van Beek on 12/02/2018.
 */
public class Praktijkopdracht extends Applet {

    private Image afbeelding;
    private URL pad;

    private int x1;
    private int y1;

    String[] cijfers = {"1", "2", "3"};

    public void init() {
        pad = Praktijkopdracht.class.getResource("images/");
        afbeelding = getImage(pad, "basic1-119_smiley_neutral-512_40px.png");

    }

    public void paint(Graphics g) {
        x1 = 0;
        y1 = 0;
        for (int i = 0; i < 23; i++) {
            x1 += 40;
            g.drawImage(afbeelding, x1, y1, 40, 40, this);
            if (i % 4 == 3) {
                y1 += 40;
                x1 = 0;
            }


        }
    }
}
