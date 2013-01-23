/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package racingboxes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


/**
 *
 * @author charles_yu102
 */
public class RacingBox extends JPanel implements Runnable{

    Thread animationThread;
    Color boxColor;
    int x, velX; 
    
    // constructor
    public RacingBox(Color color){
        boxColor = color;
        x = 20;
        velX = 5;
        animationThread = new Thread(this);
        animationThread.start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(boxColor);
        g.fillRect(x, 20, 50, 50);
    }
    
    @Override
    public void run() {
        
        while(Thread.currentThread() == animationThread && x<750){
            x += velX;
            repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(RacingBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Boolean powerUp(){
        Boolean ret = false;
        if(x<750){
            x += 10;
            ret = true;
        }
        return ret;
    }
    
}
