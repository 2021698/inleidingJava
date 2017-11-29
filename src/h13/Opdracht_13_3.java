package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by Rik van Beek on 29/11/2017.
 */
public class Opdracht_13_3 extends Applet {
    int breedte;
    int lengte;
    Color kleur;
    Button baksteen;
    Button beton;
    @Override
    public void init() {
        baksteen = new Button();
        baksteen.setLabel("Bakstenenmuur");
        baksteen.addActionListener( new baksteenListener());
        add(baksteen);
        beton = new Button();
        beton.setLabel("betonnenmuur");
        beton.addActionListener( new betonListener());
        add(beton);
    }

    @Override
    public void paint(Graphics g) {
        tekenmuur(g,breedte,lengte,kleur);
    }

    class baksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breedte = 75;
            lengte = 50;
            kleur  = Color.red;

            repaint();
        }
    }

    class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breedte = 100;
            lengte = 75;
            kleur  = Color.gray;

            repaint();
        }
    }
    void tekenmuur (Graphics g,int x1,int y1, Color kleur) {
        int x = 25;
        int y = 100;
        int reset = 2;

        for (int i = 0; i < 9 ; i++) {

            x += x1;
            g.setColor(kleur);
            g.fillRect(x,y,x1,y1);
            g.setColor(Color.black);
            g.drawRect(x,y,x1,y1);

            if ( i == reset){
                y += y1;
                reset += 3;
                x = 25;
            }
        }
    }
}
