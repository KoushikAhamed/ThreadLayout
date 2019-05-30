/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC3
 */
public class NewMain extends JPanel implements ActionListener{
    Timer timer = new Timer(15, this);
    int x = 0, velX = 2 ;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillRect(x,0 , 50 , 100);
        timer.start();
    }
    
    
    public static void main(String[] args) {
        NewMain newMain = new NewMain();
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
        jFrame.add(newMain);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        x = x + velX;
        repaint();
    }
    
}
