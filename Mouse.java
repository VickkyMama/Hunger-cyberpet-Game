package CyberPet;


import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//implements Runnable because the instance is intended to be executed by a thread
public class Mouse implements Runnable{


private ImageIcon mouse;
private JLabel LabelMouse;
private Random s = new Random();

public JLabel addMouse(){
	//adding the Mouse image to label
	mouse=new ImageIcon("C:\\Users\\VICTORIA\\workspace\\HungerCyberPet\\src\\CyberPet\\rat2.png");
	//Mouse image location
	LabelMouse=new JLabel();
	LabelMouse.setIcon(mouse);

	return LabelMouse;
	
}


@Override
//for the Mouse image to move at random and setting boundaries
public void run() 
{
	while(true){
		
        int x = s.nextInt(400);
        int y = s.nextInt(400);

        try{ 
        	LabelMouse.setBounds(x, y, 400, 400);
        	Thread.sleep(1000); 
        	}
        catch(InterruptedException e){ }
        
     			}
 }

}


