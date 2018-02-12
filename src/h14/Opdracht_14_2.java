package h14;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 25/01/2018.
 */
public class Opdracht_14_2 extends Applet {

    double randomValue, random2, random3, random4;
    int card, worp2, worp3, worp4;


    String[] kaartsoort = {"Klaver", "Harten", "Schoppen", "Ruiten"};
    String[] kaartnummer = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer"};

    String[] deck1;
    String[] deck2;
    String[] deck3;
    String[] deck4;


    public void init() {


        deck1 = new String[52];

        int hulpindex1 = 0;

        for (int i = 0; i < kaartsoort.length; i++) {
            String soort1 = kaartsoort[i];
            for (int j = 0; j < kaartnummer.length; j++) {
                String nummer1 = kaartnummer[j];
                deck1[hulpindex1] = soort1 + " " + nummer1;
                hulpindex1++;
            }
        }

    }

    public void paint(Graphics g) {
        for (int a = 0; a < 13; a++) {
            randomValue = Math.random();
            card = (int) (randomValue * 52);
            g.drawString("gedeelde kaart: " + deck1[card] + " ", 25, 50 * a);
        }
        for (int a = 0; a < 13; a++) {
            randomValue = Math.random();
            card = (int) (randomValue * 52);
            g.drawString("gedeelde kaart: " + deck1[card] + " ", 225, 50 * a);
        }
        for (int a = 0; a < 13; a++) {
            randomValue = Math.random();
            card = (int) (randomValue * 52);
            g.drawString("gedeelde kaart: " + deck1[card] + " ", 425, 50 * a);
        }
        for (int a = 0; a < 13; a++) {
            randomValue = Math.random();
            card = (int) (randomValue * 52);
            g.drawString("gedeelde kaart: " + deck1[card] + " ", 625, 50 * a);
        }
    }
}
