import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private int playerCountVal;
    private Menu(){
        setlook();
        elements();

    }
    private void setlook(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Menu");
        setLayout(new GridLayout(7,1));

    }
    private void elements(){
        JLabel titleLabel = new JLabel("Bang", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));

        add(titleLabel);

        JLabel nickLabel = new JLabel("Enter your nickname:");
        add(nickLabel);

        JTextField nick = new JTextField();
        add(nick);

        JLabel playerCountLabel = new JLabel("Choose numer of players:");
        add(playerCountLabel);

        JSlider playerCount = new JSlider(4,8);
        playerCount.setMajorTickSpacing(1);
        playerCount.setPaintTrack(true);
        playerCount.setPaintTicks(true);
        playerCount.setPaintLabels(true);
        add(playerCount);


        JButton local = new JButton("start");
        local.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                playerCountVal = playerCount.getValue();
                Table table = new Table(playerCountVal);
            }
        });
        add(local);

        JButton online = new JButton("online game");
        add(online);



        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        Menu menu = new Menu();
    }
}



