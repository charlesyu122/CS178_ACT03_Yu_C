/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package racingboxes;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author charles_yu102
 */
public class RaceStarter {
    
    // constructor
    public RaceStarter(){
        startRace();
    }
    
    private void startRace(){
        // Initialize UI
        JFrame jf = new JFrame("RACING BOXES");
        
        RacingBox rbPanel1 = new RacingBox(Color.RED);
        RacingBox rbPanel2 = new RacingBox(Color.BLUE);
        RacingBox rbPanel3 = new RacingBox(Color.YELLOW);
        RacingBox rbPanel4 = new RacingBox(Color.GREEN);
        RacingBox rbPanel5 = new RacingBox(Color.PINK);
              
        jf.setLayout(new GridLayout(5,1,1,1));
        jf.add(rbPanel1);      
        jf.add(rbPanel2);
        jf.add(rbPanel3);
        jf.add(rbPanel4);
        jf.add(rbPanel5);
        jf.setSize(800, 600);
        jf.setBackground(Color.DARK_GRAY);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Start Random Powerups
        PowerUp p = new PowerUp(rbPanel1, rbPanel2, rbPanel3, rbPanel4, rbPanel5);
        p.start();
    }
    
}
