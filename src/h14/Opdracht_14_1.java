package h14;

import java.applet.Applet;
import java.awt.*;

/**
 * MANIER 1
 * Created by Rik van Beek on 09/01/2018.
 */
/*public class Opdracht_14_1 extends Applet {

    double random;
    int worp;


    String[] kaartsoort = {"Klaver","Harten","Schoppen","Ruiten"};
    String[] kaartnummer = {"A","2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer"};

    String[] deck;


    public void init() {


        deck = new String[52];
        random = Math.random();
        worp = (int)(random*52);
        int hulpindex = 0;
        for (int i = 0; i < kaartsoort.length; i++) {
            String soort = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer = kaartnummer[j];
                deck[hulpindex] = soort + " " + nummer;
                hulpindex++;
            }
        }
    }

    public void paint(Graphics g) {

        g.drawString("gedeelde kaart: " +  deck[worp]+" ",100,100);
    }
}

package h14;

        import java.applet.Applet;
        import java.awt.*;
*/
/**
 * MANIER 2
 * Created by Rik van Beek on 09/01/2018.
 */

public class Opdracht_14_1 extends Applet {

    double random;
    int worp, soort;
    String kleur, nummer;


    String[] kaartsoort = {"Klaver","Harten","Schoppen","Ruiten"};
    String[] kaartnummer = {"A","2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer"};

    public void init(){
        worp  = (int)(random*13);
        soort = (int)(random*4);
        kleur= kaartsoort[soort];
        nummer= kaartnummer[worp];
    }

    public void paint(Graphics g) {

        g.drawString("gedeelde kaart: " +  kleur + " " + nummer+" ",100,100);
    }
}

