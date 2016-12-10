package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 9-12-2016.
 */
public class Opdracht_8_2 extends Applet {

    //student jongens
    Button sjongens;
    //student meisjes
    Button smeisjes;
    //ouder mannen
    Button omannen;
    //ouder vrouwen
    Button ovrouwen;
    //totaal
    Button stotaal;

    //a = aantal
    int ajongens = 0;
    int ameisjes = 0;
    int amannen = 0;
    int avrouwen = 0;
    int atotaal = 0;

    @Override
    public void init() {
    sjongens = new Button("student jongens");
        sjongens.addActionListener(new SjongensListener());
    smeisjes = new Button("student meisjes");
        smeisjes.addActionListener(new SmeisjesListener());
    omannen = new Button("ouder mannen");
        omannen.addActionListener(new OmannenListener());
    ovrouwen = new Button("ouder vrouwen");
        ovrouwen.addActionListener(new OvrouwenListener());
    stotaal = new Button("totaal");
        stotaal.addActionListener(new TotaalListener());
    add(sjongens);
    add(smeisjes);
    add(omannen);
    add(ovrouwen);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("aantal studenten jongens" + ajongens, 30, 30);
        g.drawString("aantal studenten meisjes" + ameisjes, 30, 40);
        g.drawString("aantal ouders mannen" + amannen, 30, 50);
        g.drawString("aantal ouders vrouwen" + avrouwen, 30, 60);
        g.drawString("totaal" + atotaal, 30, 70);

    }

    class SjongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ajongens = ajongens + 1;
            repaint();
        }
    }

    class SmeisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ameisjes = ameisjes + 1;
            repaint();
        }
    }

    class OmannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            amannen = amannen + 1;
            repaint();
        }
    }

    class OvrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            avrouwen = avrouwen + 1;
            repaint();
        }
    }

    class TotaalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            atotaal = ajongens + ameisjes + amannen + avrouwen;
            repaint();
        }
    }
}
