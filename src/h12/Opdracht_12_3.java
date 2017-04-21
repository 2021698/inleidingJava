package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

/**
 * Created by Rik van Beek on 14-2-2017.
 */
public class Opdracht_12_3 extends Applet {
    int[] getallen;
    TextField[] tekstvakken;
    int[] sort;
    Button knop;

    public void init() {
        getallen = new int[5];
        tekstvakken = new TextField[5];
        knop = new Button("OK");
        add(knop);

        for (int teller = 0; teller < getallen.length; teller++) {
            tekstvakken[teller] = new TextField();
            add(tekstvakken[teller]);
        }
        knop.addActionListener(new TextvakListener());

    }

    @Override
    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], x, y);
            y += 20;
        }
    }

    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < tekstvakken.length; teller++) {
                String s = tekstvakken[teller].getText();
                int getal = Integer.parseInt(s);
                getallen[teller] = getal;
            }

            Arrays.sort(getallen);

            for (int teller = 0; teller < getallen.length; teller++) {
                tekstvakken[teller].setText("" + getallen[teller]);
            }
            repaint();
        }
    }
}
