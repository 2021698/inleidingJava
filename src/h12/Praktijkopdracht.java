package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rik van Beek on 21-4-2017.
 */
public class Praktijkopdracht extends Applet {

    int teller = 0;
    boolean gevonden = false;
    String[] namen;
    int[] telefoon;
    TextField tekstvaknaam;
    TextField tekstvaktelefoon;

    public void init() {

        tekstvaknaam = new TextField("", 15);
        tekstvaktelefoon = new TextField("", 15);
        Label tel = new Label("telefoon nummer");
        Label naam = new Label("naam");
        Button ok = new Button("ok");
        namen = new String[10];
        telefoon = new int[10];

        ok.addActionListener(new TextListener());
        tekstvaknaam.addActionListener(new TextListener());
        tekstvaktelefoon.addActionListener(new TextListener());

        add(naam);
        add(tekstvaknaam);
        add(tel);
        add(tekstvaktelefoon);
        add(ok);
    }

    public void paint(Graphics g) {

        if (gevonden) {
            for (int teller = 0; teller < namen.length; teller++) {
                g.drawString(namen[teller], 80, 25 * teller + 20);
                g.drawString("" + telefoon[teller], 300, 25 * teller + 20);
            }
        }
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            gevonden = true;
            String naam = tekstvaknaam.getText();
            String tex = tekstvaktelefoon.getText();
            int tel = Integer.parseInt(tex);

            namen[teller] = naam;
            telefoon[teller] = tel;

            if (teller == 10) {
                gevonden = true;
            }

            teller += 1;
            repaint();
        }
    }
}
