import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

public class Cowboy extends JComponent {
    private int xposition;
    private int yposition;

    Cowboy(int xposition, int yposition){
        setLook(xposition,yposition);

    }

    private void setLook(int xposition, int yposition){
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setVisible(true);
        setBounds(xposition,yposition,75,75);
        setBackground(Color.BLUE);
        setOpaque(true);
    }

}