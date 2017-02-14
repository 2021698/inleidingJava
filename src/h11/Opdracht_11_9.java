package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 31-1-2017.
 */
public class Opdracht_11_9 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 50;
        int hoogte = 50;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            } else {
                g.drawRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //tweede rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.drawRect(x,y,breedte,hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //derde rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            } else {
                g.drawRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //vierde rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.drawRect(x,y,breedte,hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //vijfde rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            } else {
                g.drawRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //zesde rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.drawRect(x,y,breedte,hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //zevende rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            } else {
                g.drawRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //achtste rij
        x = 50;
        y += hoogte;
        for (int teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.drawRect(x,y,breedte,hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
    }
}
