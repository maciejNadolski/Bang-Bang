import javax.swing.*;

public class Cowboy extends JComponent {
    private int xposition;
    private int yposition;

    private Cowboy(int xposition,int yposition){
        setVisible(true);
        setBounds(xposition,yposition,75,75);

    }

}