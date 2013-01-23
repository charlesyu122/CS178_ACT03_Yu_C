/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package racingboxes;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles_yu102
 */
public class PowerUp extends Thread{

    RacingBox rb1, rb2, rb3, rb4, rb5;
    int finishCtr = 0;
    
    // constructor
    public PowerUp(RacingBox rb1, RacingBox rb2, RacingBox rb3, RacingBox rb4, RacingBox rb5){
        this.rb1 = rb1;
        this.rb2 = rb2;
        this.rb3 = rb3;
        this.rb4 = rb4; 
        this.rb5 = rb5;
    }
    
    @Override
    public void run() {
        
        while(Thread.currentThread() == this && finishCtr<5){
            Random box = new Random();
            int boxNumber = box.nextInt(5)+1;
            switch(boxNumber){
                case 1: if(!rb1.powerUp()) finishCtr++; break;
                case 2: if(!rb2.powerUp()) finishCtr++;; break;
                case 3: if(!rb3.powerUp()) finishCtr++;; break;
                case 4: if(!rb4.powerUp()) finishCtr++;; break;
                case 5: if(!rb5.powerUp()) finishCtr++;; break;
            }
            System.out.println("Powered up: "+boxNumber);
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PowerUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
