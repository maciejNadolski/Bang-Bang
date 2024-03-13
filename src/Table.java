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


        configMainPanel(c);
        configStatsPanel(c);
    };

    private void configMainPanel(GridBagConstraints c){
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setMinimumSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setMaximumSize(new Dimension(frameWidth,frameHeight*5/7));
        mainPanel.setVisible(true);
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setLayout(null);
        c.gridy = 0;
        elemsInMainPanel(mainPanel,4);
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
                Cowboy cowboy1 = new Cowboy(100,0);
                Cowboy cowboy2 = new Cowboy(300,0);
                Cowboy cowboy3 = new Cowboy(500,0);
                Cowboy cowboy4 = new Cowboy(500,300);
                mainPanel.add(cowboy1);
                mainPanel.add(cowboy2);
                mainPanel.add(cowboy3);
                mainPanel.add(cowboy4);
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


