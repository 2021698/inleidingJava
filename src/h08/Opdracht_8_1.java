package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 7-12-2016.
 */
public class Opdracht_8_1 extends Applet {

        Button knop_ok;
        Button knop_reset;
        TextField tekstvak;
        Label label;
        String s;

    @Override
    public void init() {
        knop_ok = new Button("OK");
        knop_reset = new Button("RESET");
        tekstvak = new TextField("", 20);
        label = new Label("type een getal");
        knop_ok.addActionListener(new KnopListenero());
        knop_reset.addActionListener(new KnopListenerr());
        add(label);
        add(tekstvak);
        add(knop_ok);
        add(knop_reset);
        s = "";

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(s, 50, 60);


    }

    class KnopListenero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class KnopListenerr implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }
}
