package h14;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 09/01/2018.
 */
public class Opdracht_14_1 extends Applet {

    double random;
    int worp;
    private int gedeeldekaart;


    String[] kaartsoort = {"Klaver","Harten","Schoppen","Ruiten"};
    String[] kaartnummer = {"A","1","2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer"};

    public void init() {

        random = Math.random();
        worp = (int)(random*52+1);
        kaartsoort = new String[4];
        kaartnummer = new String[14];
        gedeeldekaart = kaartsoort + kaartnummer;
    }

    public void paint(Graphics g) {
        g.drawString("gedeelde kaart: " + gedeeldekaart,50,50);
    }
}
