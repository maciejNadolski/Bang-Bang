import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class Table extends JFrame {
    private Integer frameWidth;
    private Integer frameHeight;
    private JPanel mainPanel;
    private JPanel statsPanel;
    private GridBagConstraints c;
    private GridBagConstraints cStat;
    private GridBagConstraints cMain;
    private int playerAmount;
    Table(int playerCountVal){
        frameWidth = 600;
        frameHeight = 600;
        this.setVisible(true);
        this.setTitle("Bang - Digital version");
        this.setSize(new Dimension(frameWidth,frameHeight));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        configMainPanel(c,playerCountVal);
        configStatsPanel(c);
    };

    private void configMainPanel(GridBagConstraints c,int playerAmount){
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setMinimumSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setMaximumSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setVisible(true);
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setLayout(null);
        c.gridy = 0;
        elemsInMainPanel(mainPanel,playerAmount);
        add(mainPanel,c);

    }

    private void elemsInMainPanel(JPanel mainPanel,int playerAmount){
        Dice dice1 = new Dice(175,200);
        Dice dice2 = new Dice(250,150);
        Dice dice3 = new Dice(325,200);
        Dice dice4 = new Dice(300,275);
        Dice dice5 = new Dice(200,275);

        switch (playerAmount) {
            case 4:
                Cowboy cowboy41 = new Cowboy(0,0);
                Cowboy cowboy42 = new Cowboy(250,0);
                Cowboy cowboy43 = new Cowboy(frameWidth-90,0);
                Cowboy cowboy44 = new Cowboy(250,350);
                mainPanel.add(cowboy41);
                mainPanel.add(cowboy42);
                mainPanel.add(cowboy43);
                mainPanel.add(cowboy44);
                break;

            case 5:
                Cowboy cowboy51 = new Cowboy(250,350);
                Cowboy cowboy52 = new Cowboy(0,0);
                Cowboy cowboy53 = new Cowboy(125,0);
                Cowboy cowboy54 = new Cowboy(375,0);
                Cowboy cowboy55 = new Cowboy(frameWidth-90,0);
                mainPanel.add(cowboy51);
                mainPanel.add(cowboy52);
                mainPanel.add(cowboy53);
                mainPanel.add(cowboy54);
                mainPanel.add(cowboy55);
                break;
            case 6:
                Cowboy cowboy61 = new Cowboy(250,350);
                Cowboy cowboy62 = new Cowboy(0,0);
                Cowboy cowboy63 = new Cowboy(125,0);
                Cowboy cowboy64 = new Cowboy(250,0);
                Cowboy cowboy65 = new Cowboy(375,0);
                Cowboy cowboy66 = new Cowboy(frameWidth-90,0);
                mainPanel.add(cowboy61);
                mainPanel.add(cowboy62);
                mainPanel.add(cowboy63);
                mainPanel.add(cowboy64);
                mainPanel.add(cowboy65);
                mainPanel.add(cowboy66);
                break;
            case 7:
                Cowboy cowboy71 = new Cowboy(250,350);
                Cowboy cowboy72 = new Cowboy(0,200);
                Cowboy cowboy73 = new Cowboy(0,0);
                Cowboy cowboy74 = new Cowboy(125,0);
                Cowboy cowboy75 = new Cowboy(375,0);
                Cowboy cowboy76 = new Cowboy(frameWidth-90,0);
                Cowboy cowboy77 = new Cowboy(frameWidth-90,200);
                mainPanel.add(cowboy71);
                mainPanel.add(cowboy72);
                mainPanel.add(cowboy73);
                mainPanel.add(cowboy74);
                mainPanel.add(cowboy75);
                mainPanel.add(cowboy76);
                mainPanel.add(cowboy77);
                break;
            case 8:
                Cowboy cowboy81 = new Cowboy(250,350);
                Cowboy cowboy82 = new Cowboy(0,200);
                Cowboy cowboy83 = new Cowboy(0,0);
                Cowboy cowboy84 = new Cowboy(125,0);
                Cowboy cowboy85 = new Cowboy(250,0);
                Cowboy cowboy86 = new Cowboy(375,0);
                Cowboy cowboy87 = new Cowboy(frameWidth-90,0);
                Cowboy cowboy88 = new Cowboy(frameWidth-90,200);
                mainPanel.add(cowboy81);
                mainPanel.add(cowboy82);
                mainPanel.add(cowboy83);
                mainPanel.add(cowboy84);
                mainPanel.add(cowboy85);
                mainPanel.add(cowboy86);
                mainPanel.add(cowboy87);
                mainPanel.add(cowboy88);
                break;




        }

        mainPanel.add(dice1);
        mainPanel.add(dice2);
        mainPanel.add(dice3);
        mainPanel.add(dice4);
        mainPanel.add(dice5);
    }
    private void configStatsPanel(GridBagConstraints c){
        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new FlowLayout());
        GridBagConstraints cStat = new GridBagConstraints();
        statsPanel.setPreferredSize(new Dimension(frameWidth,frameHeight*2/7));
        statsPanel.setMinimumSize(new Dimension(frameWidth,frameHeight*2/7));
        statsPanel.setMaximumSize(new Dimension(frameWidth,frameHeight*2/7));
        statsPanel.setVisible(true);
        statsPanel.setBackground(Color.ORANGE);
        statsPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        elemsInStatsPanel(statsPanel);

        c.gridy = 1;
        add(statsPanel,c);

    }
    private void elemsInStatsPanel(JPanel statsPanel){

        JLabel nickNameLabel = new JLabel("Nickname ");
        nickNameLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nickNameLabel.setPreferredSize(new Dimension(frameWidth/8,frameHeight*2/14));
        nickNameLabel.setMinimumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        nickNameLabel.setMaximumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        statsPanel.add(nickNameLabel);


        JLabel characterLabel = new JLabel("Postać");
        characterLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        characterLabel.setPreferredSize(new Dimension(frameWidth/8,frameHeight*2/14));
        characterLabel.setMinimumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        characterLabel.setMaximumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        statsPanel.add(characterLabel);

        JLabel characterInfo = new JLabel("opisopis opis cos tamtcosam");
        characterInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        characterInfo.setPreferredSize(new Dimension(frameWidth/4,frameHeight*2/14));
        characterInfo.setMinimumSize(new Dimension(frameWidth/4,frameHeight*2/14));
        characterInfo.setMaximumSize(new Dimension(frameWidth/4,frameHeight*2/14));
        statsPanel.add(characterInfo);

        JLabel healthStatus = new JLabel("Health");
        healthStatus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        healthStatus.setPreferredSize(new Dimension(frameWidth/8,frameHeight*2/14));
        healthStatus.setMinimumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        healthStatus.setMaximumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        statsPanel.add(healthStatus);



        JLabel arrowStatus = new JLabel("Arrows");
        arrowStatus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        arrowStatus.setPreferredSize(new Dimension(frameWidth/8,frameHeight*2/14));
        arrowStatus.setMinimumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        arrowStatus.setMaximumSize(new Dimension(frameWidth/8,frameHeight*2/14));
        statsPanel.add(arrowStatus);



    }
}


