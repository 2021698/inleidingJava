package h04;

import javafx.scene.shape.Circle;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rik van Beek on 15-11-2016.
 */
public class Praktijkopdracht extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20,20,320,20);
        g.drawString("Lijn",170,35);

        g.drawRect(20,40,300,150);
        g.drawString("Rechthoek",150,210);

        g.drawRoundRect(20,220,300,150,30,30);
        g.drawString("Afgeronde rechthoek",110,390);

        g.setColor(new Color(255, 0, 255));
        g.fillRect(340,40,300,150);
        g.setColor(Color.black);
        g.drawArc(340,40,300,150,360,360);
        g.drawString("Gevulde rechthoek met ovaal",400,210);

        g.setColor(new Color(255, 0, 255));
        g.fillArc(340,220,300,150,360,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",450,390);

        g.drawArc(660,40,300,150,360,360);
        g.setColor(new Color(255, 0, 255));
        g.fillArc(660,40,300,150,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",730,210);

        g.drawArc(735,220,150,150,360,360);
        g.drawString("Cirkel",800,390);
    }
}
