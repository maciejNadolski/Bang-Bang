import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class Dice extends JPanel {
    private int screenX;
    private int screenY;
    private int myX;
    private int myY;

    private int startX;
    private int startY;

    public Dice(Integer startX, Integer startY){
        setLook(startX,startY);
        actionFunc();
    }

    private void actionFunc(){
        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                setLocation(myX + deltaX, myY + deltaY);
            }

            @Override
            public void mouseMoved(MouseEvent e) { }

        });
    }
    private void setLook(Integer startX, Integer startY){
        Random random = new Random();
        int randint = random.nextInt(6);


        switch(randint){

            case 0:
                setBackground(Color.RED);
                break;

            case 1:
                setBackground(Color.PINK);
                break;

            case 2:
                setBackground(Color.YELLOW);
                break;

            case 3:
                setBackground(Color.BLUE);
                break;

            case 4:
                setBackground(Color.GREEN);
                break;

            case 5:
                setBackground(Color.MAGENTA);
                break;

        }

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBounds(startX, startY, 50, 50);
        setOpaque(true);
        setVisible(true);
    }
   }
