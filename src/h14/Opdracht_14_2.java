package h14;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 25/01/2018.
 */
public class Opdracht_14_2 extends Applet {

    double random1, random2, random3, random4;
    int worp1,worp2,worp3,worp4;


    String[] kaartsoort = {"Klaver","Harten","Schoppen","Ruiten"};
    String[] kaartnummer = {"A","2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer"};

    String[] deck1;
    String[] deck2;
    String[] deck3;
    String[] deck4;


    public void init() {


        deck1 = new String[13];
        deck2 = new String[13];
        deck3 = new String[13];
        deck4 = new String[13];
        random1 = Math.random();
        random2 = Math.random();
        random3 = Math.random();
        random4 = Math.random();
        worp1 = (int)(random1*52);
        worp2 = (int)(random2*52);
        worp3 = (int)(random3*52);
        worp4 = (int)(random4*52);
        int hulpindex1 = 0, hulpindex2 = 0, hulpindex3 = 0, hulpindex4 = 0;

        for (int i = 0; i < kaartsoort.length; i++) {
            String soort1 = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer1 = kaartnummer[j];
                deck1[hulpindex1] = soort1 + " " + nummer1;
                hulpindex1++;
            }
        }

        for (int i = 0; i <kaartsoort.length; i++) {
            String soort2 = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer2 = kaartnummer[j];
                deck2[hulpindex2] = soort2 + " " + nummer2;
                hulpindex2++;
            }
        }

        for (int i = 0; i <kaartsoort.length; i++) {
            String soort3 = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer3 = kaartnummer[j];
                deck3[hulpindex3] = soort3 + " " + nummer3;
                hulpindex3++;
            }
        }

        for (int i = 0; i <kaartsoort.length; i++) {
            String soort4 = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer4 = kaartnummer[j];
                deck4[hulpindex4] = soort4 + " " + nummer4;
                hulpindex4++;
            }
        }
    }

    public void paint(Graphics g) {

        g.drawString("gedeelde kaart: " +  deck1[worp1]+" ",100,100);
        g.drawString("gedeelde kaart: " +  deck2[worp2]+" ",100,100);
        g.drawString("gedeelde kaart: " +  deck3[worp3]+" ",100,100);
        g.drawString("gedeelde kaart: " +  deck4[worp4]+" ",100,100);
    }
}
