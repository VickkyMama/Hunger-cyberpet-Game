package CyberPet;


import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//implements Runnable because the instance is intended to be executed by a thread
public class Frog implements Runnable{


private ImageIcon pic;
private JLabel imgLabel;
private Random s = new Random();

public JLabel addFrog(){
	//adding the Frog image to label
	pic=new ImageIcon("C:\\Users\\VICTORIA\\workspace\\HungerCyberPet\\src\\CyberPet\\frog.png");
	//Frog image location
	imgLabel=new JLabel();
	imgLabel.setIcon(pic);

	return imgLabel;
	
}


@Override
//for the Frog image to move at random and setting boundaries
public void run() {
	while(true){
		
        int x = s.nextInt(400);
        int y = s.nextInt(200);

        try{ 
        	imgLabel.setBounds(x, y, 300, 300);
        	
        	Thread.sleep(1000); 
        	
        	}
        catch(InterruptedException e){ }
        
     }
 }
}


