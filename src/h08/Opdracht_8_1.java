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

    @Override
    public void init() {
        knop_ok = new Button("OK");
        knop_reset = new Button("RESET");
        tekstvak = new TextField("vul hier in!", 20);
        label = new Label("type een getal");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(knop_ok);
        add(knop_reset);

    }

    @Override
    public void paint(Graphics g) {



    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent r) {
            String s = tekstvak.getText();
        }
    }
}
