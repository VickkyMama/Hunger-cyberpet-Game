package CyberPet;


import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//implements Runnable because the instance is intended to be executed by a thread
public class Cat implements Runnable{


private ImageIcon cat;
private JLabel LabelCat;
private Random s = new Random();

public JLabel addCat(){
	//adding the cat image to label
	cat=new ImageIcon("C:\\Users\\VICTORIA\\workspace\\HungerCyberPet\\src\\CyberPet\\catTrans.png"); 
	//cat image location
	LabelCat=new JLabel();
	LabelCat.setIcon(cat);
	
	return LabelCat;
	
}


@Override

//for the cat image to move at random and setting boundaries
public void run() 
{
	while(true){
		
        int x = s.nextInt(400);
        int y = s.nextInt(400);

        try{ 
        	LabelCat.setBounds(x, y, 300, 200);
        	Thread.sleep(1000); 
        	}
        catch(InterruptedException e){ }
        
     			}
 }

}


