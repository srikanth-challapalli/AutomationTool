package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel {

    private Player player = new Player();

    public Board(){
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g){  
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(player.getCenter().x, player.getCenter().y,
             player.getRadius(), player.getRadius());
    } 
}

