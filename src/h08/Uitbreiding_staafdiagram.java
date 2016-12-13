package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 10-12-2016.
 */
public class Uitbreiding_staafdiagram extends Applet{
    int valerie;
    int jeroen;
    int hans;
    int base;
    int a10 = 10;
    int a20 = 20;
    int a30 = 30;
    int a40 = 40;
    int a50 = 50;
    int a60 = 60;
    int a70 = 70;
    int a80 = 80;
    int a90 = 90;
    int a100 = 100;
    Button wijig_waardes;
    TextField tvalerie;
    Label lvalerie;
    TextField tjeroen;
    Label ljeroen;
    TextField thans;
    Label lhans;
    double vgetal;
    double jgetal;
    double hgetal;
    int vuitkomst;
    int juitkomst;
    int huitkomst;

    @Override
    public void init() {
        //gewichten
        valerie = (int) vuitkomst;
        jeroen = (int) juitkomst;
        hans = (int) huitkomst;
        //berekening
        base = 320;
        lvalerie = new Label("Valerie");
        tvalerie = new TextField("", 10);
        ljeroen = new Label("Jeroen");
        tjeroen = new TextField("", 10);
        lhans = new Label("Hans");
        thans = new TextField("", 10);
        wijig_waardes = new Button("wijzig waardes");
            wijig_waardes.addActionListener(new wijzig_waardes());
        add(lvalerie);
        add(tvalerie);
        add(ljeroen);
        add(tjeroen);
        add(lhans);
        add(thans);
        add(wijig_waardes);
    }

    @Override
    public void paint(Graphics g) {

        //ylijn
        g.drawLine(60, 20, 60, 320 );

        //xlijn
        g.drawLine(60, 320, 400, 320 );

        //getallen
        g.drawString("00", 40, 320 );
        g.drawLine(40, 320, 60, 320 );
        g.drawString("20", 40, 259 );
        g.drawLine(40, 260, 60, 260 );
        g.drawString("40", 40, 199 );
        g.drawLine(40, 200, 60, 200 );
        g.drawString("60", 40, 139 );
        g.drawLine(40, 140, 60, 140 );
        g.drawString("80", 40, 79 );
        g.drawLine(40, 80, 60, 80 );
        g.drawString("100", 40, 19 );
        g.drawLine(40, 20, 60, 20 );

        //Auto tabellen (change int)
        g.drawString("Valerie", 90,360 );
        g.setColor(Color.yellow);
        g.fillRect(60,base - vuitkomst * 3, 100, vuitkomst * 3);

        g.setColor(Color.black);
        g.drawString("Jeroen", 190, 360 );
        g.setColor(Color.blue);
        g.fillRect(160,base - juitkomst * 3, 100, juitkomst * 3);

        g.setColor (Color.black);
        g.drawString("Hans", 290, 360 );
        g.setColor(Color.red);
        g.fillRect(260,base - huitkomst * 3, 100, huitkomst * 3);
    }

    class wijzig_waardes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = tvalerie.getText();
            vgetal = Integer.parseInt(a);

            String b = tjeroen.getText();
            jgetal = Integer.parseInt(b);

            String c = thans.getText();
            hgetal = Integer.parseInt(c);

            vuitkomst = (int) (vgetal);
            juitkomst = (int) (jgetal);
            huitkomst = (int) (hgetal);
            repaint();
        }
    }

}
