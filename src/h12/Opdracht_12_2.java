package h12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 6-2-2017.
 */
public class Opdracht_12_2 extends Applet {


    public void init() {
        Button[] knoppen;
        knoppen = new Button[25];
        for (int teller = 0; teller < knoppen.length; teller++) {
            knoppen[teller] = new Button("text");
            add(knoppen[teller]);
        }
    }
}
