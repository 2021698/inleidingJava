package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 6-12-2016.
 */
public class Opdracht_6_2 extends Applet{

    int sec;
    int uur;
    int dag;
    int jaar;
    int uitkomstuur;
    int uitkomstdag;
    int uitkomstjaar;

    @Override
    public void init() {
    sec = 60; //sec
    uur = 60; //min
    dag = 1440; //min
    jaar = 525600; //min
    uitkomstuur = sec * uur;
    uitkomstdag = sec * dag;
    uitkomstjaar = sec * jaar;
    }

    @Override
    public void paint(Graphics g) {
    //aantal secondes in uur
    g.drawString("aantal secondes in één uur " + uitkomstuur,20,20);
    //aantal secondes in dag
    g.drawString("aantal secondes in één dag " + uitkomstdag,20,40);
    //aantal secondes in jaar
    g.drawString("aantal secondes in één jaar " + uitkomstjaar,20,60);
    }
}
